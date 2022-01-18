package com.bcp.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.pe.beans.Response;
import com.bcp.pe.entity.TipoCambioEntity;
import com.bcp.pe.service.TipoCambioService;

import reactor.core.publisher.Mono;

/**
 * Controllador de montos.
 * 
 * @author Luis Guarda
 *
 */
@RestController
@RequestMapping("/monto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MontoController {
	
	@Autowired
	private TipoCambioService tipoCambioService;
	
	
	@PostMapping("/saveTypeChange")
	public Mono<Response> saveTypeChange (@RequestBody TipoCambioEntity request){
		
		return tipoCambioService.postSaveTypeChange(request).doOnSuccess(response ->{
		
			response.setMessage("Registro de moneda "+ request.getMoneda()+" exitosa!");		
		});
		
	}
	

}
