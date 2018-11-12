package com.example.idcretail.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idcretail.core.cartera.CarteraService;
import com.example.idcretail.core.cartera.DetailedCartera;

@RestController
@RequestMapping("/idc-retail/api/v1/cartera")
public class CarteraController {

	private CarteraService carteraService;
	
	public CarteraController(CarteraService carteraService) {
		this.carteraService = carteraService;
	}
	
	@GetMapping("/{clienteId}")
	public DetailedCartera findCarteraByCliente(@PathVariable("clienteId") Long clienteId) {
		return carteraService.findCarteraByCliente(clienteId);
	}
	
	@GetMapping("/{clienteId}/perfil/{perfilId}")
	public DetailedCartera findCarteraByClienteAndPerfil(@PathVariable("clienteId") Long clienteId, 
			@PathVariable("perfilId") Long perfilId) {
		return carteraService.findCarteraByClienteAndPerfil(clienteId, perfilId);
	}
	
	
}
