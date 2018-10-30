package com.example.idcretail.core.cliente;

public class DefaultClienteService implements ClienteService {
	
	private ClienteGateway clienteGateway;
	
	public DefaultClienteService(ClienteGateway clienteGateway) {
		this.clienteGateway = clienteGateway;
	}
	
	public Cliente findByCuitCuil(String cuitCuil) {
		return clienteGateway.findByCuitCuil(cuitCuil);
	}
	
}
