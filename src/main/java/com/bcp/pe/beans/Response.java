package com.bcp.pe.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase para Objeto Response generico.
 * 
 * @author Luis Guarda
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("message")
	private String message;

}
