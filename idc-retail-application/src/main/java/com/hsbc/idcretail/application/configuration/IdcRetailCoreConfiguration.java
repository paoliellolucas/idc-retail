package com.hsbc.idcretail.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hsbc.idcretail.core.cliente.ClienteService;
import com.hsbc.idcretail.core.cliente.DefaultClienteService;
import com.hsbc.idcretail.core.perfil.DefaultPerfilService;
import com.hsbc.idcretail.core.perfil.PerfilService;
import com.hsbc.idcretail.core.tipoactivo.DefaultTipoActivoService;
import com.hsbc.idcretail.core.tipoactivo.TipoActivoService;
import com.hsbc.idcretail.provider.ClienteDB;
import com.hsbc.idcretail.provider.PerfilDB;
import com.hsbc.idcretail.provider.TipoActivoDB;
import com.hsbc.idcretail.provider.repository.ClienteRepository;
import com.hsbc.idcretail.provider.repository.PerfilRepository;
import com.hsbc.idcretail.provider.repository.TipoActivoRepository;

@Configuration
@EnableJpaRepositories(basePackages="com.hsbc.idcretail.provider.repository")
@EntityScan(basePackages="com.hsbc.idcretail.provider.entity")
public class IdcRetailCoreConfiguration {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	PerfilRepository perfilRepository;
	
	@Autowired
	TipoActivoRepository tipoActivoRepository;
	
	@Bean
	public ClienteService clienteService() {
		return new DefaultClienteService(new ClienteDB(clienteRepository));
	}
	
	@Bean
	public PerfilService perfilService() {
		return new DefaultPerfilService(new PerfilDB(perfilRepository));
	}
	
	@Bean
	public TipoActivoService tipoActivoService() {
		return new DefaultTipoActivoService(new TipoActivoDB(tipoActivoRepository));
	}
}
