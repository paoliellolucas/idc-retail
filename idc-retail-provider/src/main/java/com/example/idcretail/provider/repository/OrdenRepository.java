package com.example.idcretail.provider.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.idcretail.provider.entity.OrdenEntity;

public interface OrdenRepository extends CrudRepository<OrdenEntity, Long> {
	
	public List<OrdenEntity> findByCarteraClienteClienteId(Long clienteId);
	
	public List<OrdenEntity> findByCarteraClienteClienteIdAndEspeciePerfilPerfilId(Long clienteId, Long perfilId);

}
