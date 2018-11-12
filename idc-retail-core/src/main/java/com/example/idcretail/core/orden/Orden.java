package com.example.idcretail.core.orden;

import com.example.idcretail.core.especie.Especie;

public class Orden {
	
	private Long ordenId;
	
	private Especie especie;
	
	private TipoOrden tipoOrden;
	
	private String estado;
	
	private String tipoOperacion;

	public Long getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public TipoOrden getTipoOrden() {
		return tipoOrden;
	}

	public void setTipoOrden(TipoOrden tipoOrden) {
		this.tipoOrden = tipoOrden;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
}
