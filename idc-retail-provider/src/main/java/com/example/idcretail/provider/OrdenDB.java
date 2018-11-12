package com.example.idcretail.provider;

import java.util.List;
import java.util.stream.Collectors;

import com.example.idcretail.core.orden.Orden;
import com.example.idcretail.core.orden.OrdenGateway;
import com.example.idcretail.provider.entity.OrdenEntity;
import com.example.idcretail.provider.repository.OrdenRepository;

public class OrdenDB implements OrdenGateway {
	
	private OrdenRepository ordenRepository;
	
	public OrdenDB(OrdenRepository ordenRepository) {
		this.ordenRepository = ordenRepository;
	}

	@Override
	public List<Orden> findOrdenByCliente(Long clienteId) {
		List<OrdenEntity> ordenes = ordenRepository.findByCarteraClienteClienteId(clienteId);
		
		return generateResponse(ordenes);
	}
	
	@Override
	public List<Orden> findOrdenByClienteAndPerfil(Long clienteId, Long perfilId) {
		List<OrdenEntity> ordenes = ordenRepository.findByCarteraClienteClienteIdAndEspeciePerfilPerfilId(clienteId, perfilId);
		
		return generateResponse(ordenes);
	}
	
	private List<Orden> generateResponse(List<OrdenEntity> ordenes) {
		return ordenes.stream()
				.map(this::convertToDomain)
				.collect(Collectors.toList());
	}
	
	private Orden convertToDomain(OrdenEntity entity) {
		Orden orden = new Orden();
		orden.setOrdenId(entity.getOrdenId());
		orden.setEstado(entity.getEstado());
		orden.setTipoOperacion(entity.getTipoOperacion());
		orden.setCartera(CarteraDB.convertEntityToDomain(entity.getCartera()));
		orden.setEspecie(EspecieDB.convertEntityToDomain(entity.getEspecie()));
		orden.setTipoOrden(Utils.convertTipoOrdenToDomain(entity.getTipoOrden()));
		
		return orden;
	}
}
