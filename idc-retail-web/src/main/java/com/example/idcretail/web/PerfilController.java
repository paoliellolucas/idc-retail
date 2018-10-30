package com.example.idcretail.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idcretail.core.perfil.Perfil;
import com.example.idcretail.core.perfil.PerfilService;

@RestController
@RequestMapping("/idc-retail/api/v1/perfil")
public class PerfilController {
	
	private PerfilService perfilService;
	
	public PerfilController(PerfilService perfilService) {
		this.perfilService = perfilService;
	}

	@GetMapping
	public List<Perfil> findPerfiles() {
		return perfilService.findPerfiles();
	}
}
