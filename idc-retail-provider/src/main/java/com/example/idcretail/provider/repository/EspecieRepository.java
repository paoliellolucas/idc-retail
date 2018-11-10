package com.example.idcretail.provider.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.idcretail.provider.entity.EspecieEntity;

public interface EspecieRepository extends CrudRepository<EspecieEntity, Long> {
	
	List<EspecieEntity> findByPerfilPerfilId(Long perfilId);

	List<EspecieEntity> findByTipoActivoTipoActivoId(Long tipoActivoId);
	
	List<EspecieEntity> findByTipoActivoTipoActivoIdAndPerfilPerfilId(Long tipoActivoId, Long perfilId);

}
