package com.bcp.pe.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.pe.beans.RequestMonto;
import com.bcp.pe.beans.ResponseMonto;
import com.bcp.pe.entity.MontoEntity;
import com.bcp.pe.entity.TipoCambioEntity;
import com.bcp.pe.repository.MontoRepository;
import com.bcp.pe.repository.TipoCambioRepository;
import com.bcp.pe.service.MontoService;

import reactor.core.publisher.Mono;

@Service
public class MontoServiceImpl implements MontoService{
	
	@Autowired
	private TipoCambioRepository tipoCambioRepository;
	
	@Autowired
	private MontoRepository montoRepository;

	@Override
	public Mono<ResponseMonto> postChangeMonto(RequestMonto request) {
		
		String precioMonedaBaseDestino = null;
		
		String monedaOrigen=request.getMonedaOrigen();
		String monedaDestino=request.getMonedaDestino();
		BigDecimal montoAtipoCambio = null;
		BigDecimal montoAcambiar=request.getMontoAcambiar();
		
		List<TipoCambioEntity> precioMoneda=tipoCambioRepository.findAll();

		//Busqueda del precio de la moneda destino y operación
		for(TipoCambioEntity i:precioMoneda) {
			
			if(i.getMoneda().equals(request.getMonedaDestino())) {
				precioMonedaBaseDestino=i.getTipoCambio();
				
				montoAtipoCambio= new BigDecimal(precioMonedaBaseDestino);
				montoAtipoCambio=montoAcambiar.multiply(montoAtipoCambio);
				
			}
			
		}
		
		//Seteo para response
		ResponseMonto responseMonto = new ResponseMonto();
		
		responseMonto.setMonto(montoAcambiar);
		responseMonto.setMontoConTipoCambio(montoAtipoCambio);
		responseMonto.setMonedaDestino(monedaDestino);
		responseMonto.setMonedaOrigen(monedaOrigen);
		responseMonto.setTipoCambio(precioMonedaBaseDestino);
		
		
		//Seteo para registrar la operación
		MontoEntity montoEntity=new MontoEntity();
		montoEntity.setMonto(montoAcambiar);
		montoEntity.setMontoConTipoCambio(montoAtipoCambio);
		montoEntity.setMonedaDestino(monedaDestino);
		montoEntity.setMonedaOrigen(monedaOrigen);
		montoEntity.setTipoCambio(precioMonedaBaseDestino);
		
		montoRepository.save(montoEntity);
		
		
		return Mono.justOrEmpty(responseMonto);
	}

}
