package com.example.idcretail.core.orden;

import java.util.List;

public interface OrdenService {

	public List<Orden> findOrdenByCliente(Long clienteId);

	public List<Orden> findOrdenByClienteAndPerfil(Long clienteId, Long perfilId);
}
