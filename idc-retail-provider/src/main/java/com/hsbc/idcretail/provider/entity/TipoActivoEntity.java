package com.hsbc.idcretail.provider.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_ACTIVO")
public class TipoActivoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tipoActivoId;
	
	@Column
	private String codigo;
	
	@Column
	private String descripcion;

	public Long getTipoActivoId() {
		return tipoActivoId;
	}

	public void setTipoActivoId(Long tipoActivoId) {
		this.tipoActivoId = tipoActivoId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
