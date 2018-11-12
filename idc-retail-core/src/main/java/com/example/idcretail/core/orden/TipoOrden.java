package com.example.idcretail.core.orden;

import java.math.BigDecimal;

public class TipoOrden {

	private Long tipoOrdenId;
	
	private String tipoCantidad;
	
	private BigDecimal cantidad;
	
	private String modalidad;
	
	private int plazo;

	public Long getTipoOrdenId() {
		return tipoOrdenId;
	}

	public void setTipoOrdenId(Long tipoOrdenId) {
		this.tipoOrdenId = tipoOrdenId;
	}

	public String getTipoCantidad() {
		return tipoCantidad;
	}

	public void setTipoCantidad(String tipoCantidad) {
		this.tipoCantidad = tipoCantidad;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
