package com.example.idcretail.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.idcretail.core.cartera.CarteraService;
import com.example.idcretail.core.cartera.DefaultCarteraService;
import com.example.idcretail.core.cliente.ClienteService;
import com.example.idcretail.core.cliente.DefaultClienteService;
import com.example.idcretail.core.especie.DefaultEspecieService;
import com.example.idcretail.core.especie.EspecieService;
import com.example.idcretail.core.perfil.DefaultPerfilService;
import com.example.idcretail.core.perfil.PerfilService;
import com.example.idcretail.core.tipoactivo.DefaultTipoActivoService;
import com.example.idcretail.core.tipoactivo.TipoActivoService;
import com.example.idcretail.provider.CarteraDB;
import com.example.idcretail.provider.ClienteDB;
import com.example.idcretail.provider.EspecieDB;
import com.example.idcretail.provider.PerfilDB;
import com.example.idcretail.provider.TipoActivoDB;
import com.example.idcretail.provider.repository.CarteraRepository;
import com.example.idcretail.provider.repository.ClienteRepository;
import com.example.idcretail.provider.repository.EspecieRepository;
import com.example.idcretail.provider.repository.PerfilRepository;
import com.example.idcretail.provider.repository.TipoActivoRepository;

@Configuration
@EnableJpaRepositories(basePackages="com.example.idcretail.provider.repository")
@EntityScan(basePackages="com.example.idcretail.provider.entity")
public class IdcRetailCoreConfiguration {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	PerfilRepository perfilRepository;
	
	@Autowired
	TipoActivoRepository tipoActivoRepository;
	
	@Autowired
	EspecieRepository especieRepository;
	
	@Autowired
	CarteraRepository carteraRepository;
	
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
	
	@Bean
	public EspecieService especieService() {
		return new DefaultEspecieService(new EspecieDB(especieRepository));
	}
	
	@Bean
	public CarteraService carteraService() {
		return new DefaultCarteraService(new CarteraDB(carteraRepository));
	}
	
}
