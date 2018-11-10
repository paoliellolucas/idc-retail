package com.example.idcretail.provider.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_orden")
public class TipoOrdenEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tipoOrdenId;
	
	@Column
	private String tipoCantidad;
	
	@Column
	private BigDecimal cantidad;
	
	@Column
	private String modalidad;
	
	@Column
	private Integer plazo;

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

	public Integer getPlazo() {
		return plazo;
	}

	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}
}
