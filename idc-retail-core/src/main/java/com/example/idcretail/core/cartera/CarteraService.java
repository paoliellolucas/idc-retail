package com.example.idcretail.core.cartera;

public interface CarteraService {

	public DetailedCartera findCarteraByCliente(Long clienteId);
	
	public DetailedCartera findCarteraByClienteAndPerfil(Long clienteId, Long perfilId);
}
