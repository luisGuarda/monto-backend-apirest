package com.bcp.pe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoCambioEntity {
	
	public static final String MSG_NOT_EMPTY="No puede quedar vacio";
	@Id
	@GeneratedValue
	private int id;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("moneda")
	@NotEmpty(message = MSG_NOT_EMPTY)
	private String moneda;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("tipoCambio")
	@NotEmpty(message= MSG_NOT_EMPTY)
	private String tipoCambio;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("simboloMoneda")
	@NotEmpty(message= MSG_NOT_EMPTY)
	private String simboloMoneda;

}
