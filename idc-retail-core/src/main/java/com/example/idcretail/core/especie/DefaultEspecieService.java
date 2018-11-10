package com.example.idcretail.core.especie;

import java.util.List;

public class DefaultEspecieService implements EspecieService {

	private EspecieGateway especieGateway;
	
	public DefaultEspecieService(EspecieGateway especieGateway) {
		this.especieGateway = especieGateway;
	}
	
	public List<Especie> findByPerfil(Long perfilId) {
		return especieGateway.findByPerfil(perfilId);
	}

	public List<Especie> findByTipoActivo(Long tipoActivoId) {
		return especieGateway.findByTipoActivo(tipoActivoId);
	}

	public List<Especie> findByTipoActivoAndPerfil(Long tipoActivoId, Long perfilId) {
		return especieGateway.findByTipoActivoAndPerfil(tipoActivoId, perfilId);
	}

}
