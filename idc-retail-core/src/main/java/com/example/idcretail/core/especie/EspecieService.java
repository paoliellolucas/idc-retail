package com.example.idcretail.core.especie;

import java.util.List;

public interface EspecieService {

	public List<Especie> findByPerfil(Long perfilId);
	
	public List<Especie> findByTipoActivo(Long tipoActivoId);
	
	public List<Especie> findByTipoActivoAndPerfil(Long tipoActivoId, Long perfilId);
}
