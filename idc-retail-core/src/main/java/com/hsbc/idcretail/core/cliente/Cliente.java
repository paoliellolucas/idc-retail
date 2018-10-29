package com.hsbc.idcretail.core.cliente;

import java.math.BigDecimal;

public class Cliente {
	
	private Long clienteId;
	
	private String cuitCuil;
	
	private BigDecimal saldo;

	public Cliente() {}

	public Long getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	
	public String getCuitCuil() {
		return cuitCuil;
	}

	public void setCuitCuil(String cuitCuil) {
		this.cuitCuil = cuitCuil;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
}
