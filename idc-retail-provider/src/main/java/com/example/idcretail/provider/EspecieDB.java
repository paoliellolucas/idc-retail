package com.example.idcretail.provider;

import java.util.List;
import java.util.stream.Collectors;

import com.example.idcretail.core.especie.Especie;
import com.example.idcretail.core.especie.EspecieGateway;
import com.example.idcretail.provider.entity.EspecieEntity;
import com.example.idcretail.provider.entity.PerfilEntity;
import com.example.idcretail.provider.entity.TipoActivoEntity;
import com.example.idcretail.provider.repository.EspecieRepository;

public class EspecieDB implements EspecieGateway {

	private EspecieRepository especieRepository;
	
	public EspecieDB(EspecieRepository especieRepository) {
		this.especieRepository = especieRepository;
	}
	
	@Override
	public List<Especie> findByPerfil(Long perfilId) {

		return especieRepository.findByPerfilPerfilId(perfilId).stream()
				.map(this::convertEntityToDomain)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Especie> findByTipoActivo(Long tipoActivoId) {
		
		return especieRepository.findByTipoActivoTipoActivoId(tipoActivoId).stream()
				.map(this::convertEntityToDomain)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Especie> findByTipoActivoAndPerfil(Long tipoActivoId, Long perfilId) {
		
		return especieRepository.findByTipoActivoTipoActivoIdAndPerfilPerfilId(tipoActivoId, perfilId).stream()
				.map(this::convertEntityToDomain)
				.collect(Collectors.toList());
	}
	
	private Especie convertEntityToDomain(EspecieEntity entity) {
		PerfilEntity perfil = entity.getPerfil();
		TipoActivoEntity tipoActivo = entity.getTipoActivo();
		
		Especie especie = new Especie();
		especie.setEspecieId(entity.getEspecieId());
		especie.setPerfilId(perfil.getPerfilId());
		especie.setPerfil(perfil.getNombre());
		especie.setTipoActivoId(tipoActivo.getTipoActivoId());
		especie.setTipoActivoDescripcion(tipoActivo.getDescripcion());
		especie.setCodigo(entity.getCodigo());
		especie.setDescripcion(entity.getDescripcion());
		
		return especie;
	}
}
