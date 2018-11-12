package com.example.idcretail.provider;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.idcretail.core.ResourceNotFoundException;
import com.example.idcretail.core.cartera.CarteraGateway;
import com.example.idcretail.core.cartera.DetailedCartera;
import com.example.idcretail.provider.entity.CarteraEntity;
import com.example.idcretail.provider.entity.ClienteEntity;
import com.example.idcretail.provider.entity.OrdenEntity;
import com.example.idcretail.provider.repository.CarteraRepository;

public class CarteraDB implements CarteraGateway {

	private CarteraRepository carteraRepository;
	
	public CarteraDB(CarteraRepository carteraRepository) {
		this.carteraRepository = carteraRepository;
	}
	
	@Override
	public DetailedCartera findCarteraByCliente(Long clienteId) {
		Optional<CarteraEntity> cartera = carteraRepository.findByClienteClienteId(clienteId);
		
		return cartera.map(this::convertEntityToDomain)
				.orElseThrow(() -> new ResourceNotFoundException("Client Not Found"));
	}
	
	@Override
	public DetailedCartera findCarteraByClienteAndPerfil(Long clienteId, Long perfilId) {
		Optional<CarteraEntity> cartera = carteraRepository.findByClienteAndPerfil(clienteId, perfilId);
		
		return cartera.map(this::convertEntityToDomain)
			.orElseThrow(() -> new ResourceNotFoundException("Client and Perfil Not Found"));
	}
	
	private DetailedCartera convertEntityToDomain(CarteraEntity entity) {
		ClienteEntity cliente = entity.getCliente();
		
		DetailedCartera cartera = new DetailedCartera();
		cartera.setCarteraId(entity.getCarteraId());
		cartera.setNombreCartera(entity.getNombre());
		cartera.setClienteId(cliente.getClienteId());
		cartera.setCuitCuil(cliente.getCuitCuil());
		
		List<OrdenEntity> ordenes = entity.getOrdenes();
		cartera.setOrdenes(ordenes.stream()
			.map(Utils::convertOrdenToDomain)
			.collect(Collectors.toList()));
		
		return cartera;
	}
}
