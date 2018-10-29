package com.hsbc.idcretail.provider;

import com.hsbc.idcretail.core.cliente.Cliente;
import com.hsbc.idcretail.core.cliente.ClienteGateway;
import com.hsbc.idcretail.provider.entity.ClienteEntity;
import com.hsbc.idcretail.provider.repository.ClienteRepository;

public class ClienteDB implements ClienteGateway {

	ClienteRepository clienteRepository;
	
	public ClienteDB(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente findByCuitCuil(String cuitCuil) {
		ClienteEntity cliente = clienteRepository.findByCuitCuil(cuitCuil); 
		return entityToDomain(cliente);
	}
	
	private Cliente entityToDomain(ClienteEntity entity) {
		Cliente cliente = new Cliente();
		cliente.setClienteId(entity.getClienteId());
		cliente.setCuitCuil(entity.getCuitCuil());
		cliente.setSaldo(entity.getSaldo());
		
		return cliente;
	}

}
