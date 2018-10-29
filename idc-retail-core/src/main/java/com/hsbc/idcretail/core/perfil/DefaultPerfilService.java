package com.hsbc.idcretail.core.perfil;

import java.util.List;

public class DefaultPerfilService implements PerfilService {

	private PerfilGateway perfilGateway;
	
	public DefaultPerfilService(PerfilGateway perfilGateway) {
		this.perfilGateway = perfilGateway;
	}
	
	public List<Perfil> findPerfiles() {
		return perfilGateway.findPerfiles();
	}

}
