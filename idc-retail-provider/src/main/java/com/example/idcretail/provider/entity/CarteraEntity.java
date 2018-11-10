package com.example.idcretail.provider.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartera")
public class CarteraEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long carteraId;
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	private ClienteEntity cliente;
	
	@Column
	private String nombre;

	public Long getCarteraId() {
		return carteraId;
	}

	public void setCarteraId(Long carteraId) {
		this.carteraId = carteraId;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
