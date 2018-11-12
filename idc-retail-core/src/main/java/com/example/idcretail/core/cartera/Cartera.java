package com.example.idcretail.core.cartera;

public class Cartera {

	private Long carteraId;
	
	private Long clienteId;
	
	private String cuitCuil;
	
	private String nombreCartera;

	public Long getCarteraId() {
		return carteraId;
	}

	public void setCarteraId(Long carteraId) {
		this.carteraId = carteraId;
	}

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

	public String getNombreCartera() {
		return nombreCartera;
	}

	public void setNombreCartera(String nombreCartera) {
		this.nombreCartera = nombreCartera;
	}
}
