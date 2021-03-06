package com.example.idcretail.provider;

import java.util.List;
import java.util.stream.Collectors;

import com.example.idcretail.core.tipoactivo.TipoActivo;
import com.example.idcretail.core.tipoactivo.TipoActivoGateway;
import com.example.idcretail.provider.entity.TipoActivoEntity;
import com.example.idcretail.provider.repository.TipoActivoRepository;

public class TipoActivoDB implements TipoActivoGateway {
	
	private TipoActivoRepository tipoActivoRepository;
	
	public TipoActivoDB(TipoActivoRepository tipoActivoRepository) {
		this.tipoActivoRepository = tipoActivoRepository;
	}

	@Override
	public List<TipoActivo> findTipoActivos() {
		Iterable<TipoActivoEntity> tipoActivos = tipoActivoRepository.findAll();
		
		return StreamHelper.stream(tipoActivos)
				.map(this::entityToDomain)
				.collect(Collectors.toList());
	}
	
	private TipoActivo entityToDomain(TipoActivoEntity entity) {
		TipoActivo tipoActivo = new TipoActivo();
		tipoActivo.setTipoActivoId(entity.getTipoActivoId());
		tipoActivo.setCodigo(entity.getCodigo());
		tipoActivo.setDescripcion(entity.getDescripcion());
		
		return tipoActivo;
	}

}
