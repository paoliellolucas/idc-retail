package com.example.idcretail.provider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.idcretail.provider.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {
	
	public ClienteEntity findByCuitCuil(String cuitCuil);

}
