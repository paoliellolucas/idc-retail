package com.hsbc.idcretail.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.idcretail.core.cliente.Cliente;
import com.hsbc.idcretail.core.cliente.ClienteService;

@RestController
@RequestMapping("/idc-retail/api/v1/cliente")
public class ClienteController {
	
	private ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping("/{cuitCuil}")
	public Cliente getCliente(@PathVariable(value = "cuitCuil") String cuitCuil) {
		return clienteService.findByCuitCuil(cuitCuil);
	}
}
