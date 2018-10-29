package com.hsbc.idcretail.core.tipoactivo;

import java.util.List;

public class DefaultTipoActivoService implements TipoActivoService {
	
	private TipoActivoGateway tipoActivoGateway;
	
	public DefaultTipoActivoService(TipoActivoGateway tipoActivoGateway) {
		this.tipoActivoGateway = tipoActivoGateway;
	}

	public List<TipoActivo> findTipoActivos() {
		return tipoActivoGateway.findTipoActivos();
	}

}
