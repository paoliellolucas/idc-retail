package com.hsbc.idcretail.core.tipoactivo;

public class TipoActivo {

	private Long tipoActivoId;
	
	private String codigo;
	
	private String descripcion;
	
	public TipoActivo() {}

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
