package com.bcp.pe.service.impl;

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
	

}
