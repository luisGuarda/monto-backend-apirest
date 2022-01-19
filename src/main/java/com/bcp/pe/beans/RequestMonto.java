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
public class RequestMonto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("monto")
    private BigDecimal montoAcambiar;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("monedaOrigen")
    private String monedaOrigen;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("monedaDestino")
    private String monedaDestino;
    
}
