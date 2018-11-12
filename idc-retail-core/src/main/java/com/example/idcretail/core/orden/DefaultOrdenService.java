package com.example.idcretail.core.orden;

import java.util.List;

public class DefaultOrdenService implements OrdenService {
	
	private OrdenGateway ordenGateway;
	
	public DefaultOrdenService(OrdenGateway ordenGateway) {
		this.ordenGateway = ordenGateway;
	}
	
	public List<Orden> findOrdenByCliente(Long clienteId) {
		return ordenGateway.findOrdenByCliente(clienteId);
	}

	public List<Orden> findOrdenByClienteAndPerfil(Long clienteId, Long perfilId) {
		return ordenGateway.findOrdenByClienteAndPerfil(clienteId, perfilId);
	}

}
