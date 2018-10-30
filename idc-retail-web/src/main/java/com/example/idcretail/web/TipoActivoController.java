package com.example.idcretail.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idcretail.core.tipoactivo.TipoActivo;
import com.example.idcretail.core.tipoactivo.TipoActivoService;

@RestController
@RequestMapping("/idc-retail/api/v1/tipo-activo")
public class TipoActivoController {
	
	private TipoActivoService tipoActivoService;
	
	public TipoActivoController(TipoActivoService tipoActivoService) {
		this.tipoActivoService = tipoActivoService;
	}
	
	@GetMapping
	public List<TipoActivo> findTipoActivos() {
		return tipoActivoService.findTipoActivos();
	}

}
