package com.example.idcretail.core.especie;

public class Especie {

	private Long especieId;
	
	private Long tipoActivoId;
	
	private Long perfilId;
	
	private String codigo;
	
	private String descripcion;
	
	private String tipoActivoDescripcion;
	
	private String perfil;

	public Long getEspecieId() {
		return especieId;
	}

	public void setEspecieId(Long especieId) {
		this.especieId = especieId;
	}

	public Long getTipoActivoId() {
		return tipoActivoId;
	}

	public void setTipoActivoId(Long tipoActivoId) {
		this.tipoActivoId = tipoActivoId;
	}

	public Long getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Long perfilId) {
		this.perfilId = perfilId;
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

	public String getTipoActivoDescripcion() {
		return tipoActivoDescripcion;
	}

	public void setTipoActivoDescripcion(String tipoActivoDescripcion) {
		this.tipoActivoDescripcion = tipoActivoDescripcion;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfilNombre) {
		this.perfil = perfilNombre;
	}
}
