package com.example.idcretail.provider;

import java.util.List;
import java.util.stream.Collectors;

import com.example.idcretail.core.perfil.Perfil;
import com.example.idcretail.core.perfil.PerfilGateway;
import com.example.idcretail.provider.entity.PerfilEntity;
import com.example.idcretail.provider.repository.PerfilRepository;

public class PerfilDB implements PerfilGateway {

	private PerfilRepository perfilRepository;
	
	public PerfilDB(PerfilRepository perfilRepository) {
		this.perfilRepository = perfilRepository;
	}
	
	@Override
	public List<Perfil> findPerfiles() {
		Iterable<PerfilEntity> perfiles = perfilRepository.findAll();
		
		return StreamHelper.stream(perfiles)
				.map(this::entityToDomain)
				.collect(Collectors.toList());
	}
	
	private Perfil entityToDomain(PerfilEntity entity) {
		Perfil perfil = new Perfil();
		perfil.setPerfilId(entity.getPerfilId());
		perfil.setNombre(entity.getNombre());
		
		return perfil;
	}

}
