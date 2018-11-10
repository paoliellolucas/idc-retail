package com.example.idcretail.provider.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordenId;
	
	@ManyToOne
	@JoinColumn(name = "especie_id")
	private EspecieEntity especie;
	
	@ManyToOne
	@JoinColumn(name = "cartera_id")
	private CarteraEntity cartera;
	
	@OneToOne
	@JoinColumn(name = "tipo_orden_id")
	private TipoOrdenEntity tipoOrden;
	
	@Column
	private String estado;
	
	@Column
	private String tipoOperacion;

	public Long getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}

	public EspecieEntity getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieEntity especie) {
		this.especie = especie;
	}

	public CarteraEntity getCartera() {
		return cartera;
	}

	public void setCartera(CarteraEntity cartera) {
		this.cartera = cartera;
	}

	public TipoOrdenEntity getTipoOrden() {
		return tipoOrden;
	}

	public void setTipoOrden(TipoOrdenEntity tipoOrden) {
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
