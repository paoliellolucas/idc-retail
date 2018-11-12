package com.example.idcretail.provider.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.idcretail.provider.entity.CarteraEntity;

public interface CarteraRepository extends CrudRepository<CarteraEntity, Long> {
	
	public Optional<CarteraEntity> findByClienteClienteId(Long clienteId);
	
	@Query("select c from CarteraEntity c "
			+ "inner join  c.ordenes o "
			+ "inner join o.especie e "
			+ "where e.perfil.perfilId = :perfilId "
			+ "and c.cliente.clienteId = :clienteId")
	public Optional<CarteraEntity> findByClienteAndPerfil(@Param("clienteId") Long clienteId, @Param("perfilId") Long perfilId);
	
}
