package com.example.idcretail.core.cartera;

public class DefaultCarteraService implements CarteraService {
	
	private CarteraGateway carteraGateway;
	
	public DefaultCarteraService(CarteraGateway carteraGateway) {
		this.carteraGateway = carteraGateway;
	}

	public DetailedCartera findCarteraByCliente(Long clienteId) {
		return carteraGateway.findCarteraByCliente(clienteId);
	}

	public DetailedCartera findCarteraByClienteAndPerfil(Long clienteId, Long perfilId) {
		return carteraGateway.findCarteraByClienteAndPerfil(clienteId, perfilId);
	}

}
