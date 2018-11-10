package com.example.idcretail.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idcretail.core.especie.Especie;
import com.example.idcretail.core.especie.EspecieService;

@RestController
@RequestMapping("/idc-retail/api/v1/especie")
public class EspecieController {
	
	private EspecieService especieService;
	
	public EspecieController(EspecieService especieService) {
		this.especieService = especieService;
	}
	
	@GetMapping("/perfil/{perfilId}")
	public List<Especie> findEspecieByPerfil(@PathVariable("perfilId") Long perfilId) {
		return especieService.findByPerfil(perfilId);
	}
	
	@GetMapping("/tipo-activo/{tipoActivoId}")
	public List<Especie> findEspecieByTipoActivo(@PathVariable("tipoActivoId") Long tipoActivoId) {
		return especieService.findByTipoActivo(tipoActivoId);
	}
	
	@GetMapping("/tipo-activo/{tipoActivoId}/perfil/{perfilId}")
	public List<Especie> findByTipoActivoAndPerfil(@PathVariable("tipoActivoId") Long tipoActivoId, 
			@PathVariable("perfilId") Long perfilId) {
		return especieService.findByTipoActivoAndPerfil(tipoActivoId, perfilId);
	}

}
