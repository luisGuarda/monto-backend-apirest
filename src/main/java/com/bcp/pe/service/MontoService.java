package com.bcp.pe.service;

import com.bcp.pe.beans.RequestMonto;
import com.bcp.pe.beans.ResponseMonto;

import reactor.core.publisher.Mono;

public interface MontoService {
	
	Mono<ResponseMonto> postChangeMonto(RequestMonto request);

}
