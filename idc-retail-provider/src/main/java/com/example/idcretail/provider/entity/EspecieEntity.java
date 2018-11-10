package com.example.idcretail.provider.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Especie")
public class EspecieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long especieId;
	
	@ManyToOne
	@JoinColumn(name="perfil_id")
	private PerfilEntity perfil;
	
	@ManyToOne
	@JoinColumn(name="tipo_activo_id")
	private TipoActivoEntity tipoActivo;
	
	@Column
	private String codigo;
	
	@Column
	private String descripcion;

	public Long getEspecieId() {
		return especieId;
	}

	public void setEspecieId(Long especieId) {
		this.especieId = especieId;
	}

	public PerfilEntity getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public TipoActivoEntity getTipoActivo() {
		return tipoActivo;
	}

	public void setTipoActivoId(TipoActivoEntity tipoActivo) {
		this.tipoActivo = tipoActivo;
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
