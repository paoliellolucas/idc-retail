package com.example.idcretail.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idcretail.core.orden.Orden;
import com.example.idcretail.core.orden.OrdenService;

@RestController
@RequestMapping("/idc-retail/api/v1/orden")
public class OrdenController {
	
	private OrdenService ordenService;
	
	public OrdenController(OrdenService ordenService) {
		this.ordenService = ordenService;
	}
	
	@GetMapping("/cliente/{clienteId}")
	public List<Orden> findOrdenByCliente(@PathVariable("clienteId") Long clienteId) {
		return ordenService.findOrdenByCliente(clienteId);
	}
	
	@GetMapping("/cliente/{clienteId}/perfil/{perfilId}")
	public List<Orden> findOrdenByClienteAndPerfil(@PathVariable("clienteId") Long clienteId, 
			@PathVariable("perfilId") Long perfilId) {
		return ordenService.findOrdenByClienteAndPerfil(clienteId, perfilId);
	}

}
