package com.example.idcretail.provider;

import java.util.Optional;

import com.example.idcretail.core.ResourceNotFoundException;
import com.example.idcretail.core.cliente.Cliente;
import com.example.idcretail.core.cliente.ClienteGateway;
import com.example.idcretail.provider.entity.ClienteEntity;
import com.example.idcretail.provider.repository.ClienteRepository;

public class ClienteDB implements ClienteGateway {

	ClienteRepository clienteRepository;
	
	public ClienteDB(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente findByCuitCuil(String cuitCuil) {
		Optional<ClienteEntity> cliente = clienteRepository.findByCuitCuil(cuitCuil); 
		return cliente.map(this::entityToDomain)
				.orElseThrow(() -> new ResourceNotFoundException("Cuit Cuil Not Found"));
	}
	
	private Cliente entityToDomain(ClienteEntity entity) {
		Cliente cliente = new Cliente();
		cliente.setClienteId(entity.getClienteId());
		cliente.setCuitCuil(entity.getCuitCuil());
		cliente.setSaldo(entity.getSaldo());
		
		return cliente;
	}

}
