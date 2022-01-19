package com.bcp.pe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.pe.beans.Response;
import com.bcp.pe.entity.TipoCambioEntity;
import com.bcp.pe.repository.TipoCambioRepository;
import com.bcp.pe.service.TipoCambioService;

import reactor.core.publisher.Mono;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	
	@Autowired
	private TipoCambioRepository tipoCambioRepository;

	@Override
	public Mono<Response> postSaveTypeChange(TipoCambioEntity request) {
		
		Response response= new Response();
		
		tipoCambioRepository.save(request);
		
		
		
		return Mono.justOrEmpty(response);
	}

	@Override
	public Mono<TipoCambioEntity> postUpdateTypeChange(TipoCambioEntity request, int id) {
		
		TipoCambioEntity tipoCambioEntity = tipoCambioRepository.findById(id);
		tipoCambioEntity.setMoneda(request.getMoneda());
		tipoCambioEntity.setTipoCambio(request.getTipoCambio());
		tipoCambioEntity.setSimboloMoneda(request.getSimboloMoneda());
		tipoCambioRepository.save(tipoCambioEntity);
		
		return Mono.justOrEmpty(tipoCambioEntity);
	}

}
