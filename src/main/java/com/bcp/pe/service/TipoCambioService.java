package com.bcp.pe.service;

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

}
