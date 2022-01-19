package com.bcp.pe.service;

import java.util.List;

import com.bcp.pe.beans.Response;
import com.bcp.pe.entity.TipoCambioEntity;

import reactor.core.publisher.Mono;

/**
 * Clase service para tipo de cambio.
 * 
 * @author Luis Guarda
 *
 */
public interface TipoCambioService {
	
	public Mono<Response> postSaveTypeChange(TipoCambioEntity request);
	
	public Mono<TipoCambioEntity> postUpdateTypeChange(TipoCambioEntity request, int id);
	

}
