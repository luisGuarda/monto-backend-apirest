package com.bcp.pe.beans;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMonto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("monto")
	private BigDecimal monto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("montoConTipoCambio")
	private BigDecimal montoConTipoCambio;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("monedaOrigen")
	private String monedaOrigen;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("monedaDestino")
	private String monedaDestino;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("tipoCambio")
	private String tipoCambio;

}
