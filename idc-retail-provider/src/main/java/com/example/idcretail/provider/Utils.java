package com.example.idcretail.provider;

import com.example.idcretail.core.orden.Orden;
import com.example.idcretail.core.orden.TipoOrden;
import com.example.idcretail.provider.entity.OrdenEntity;
import com.example.idcretail.provider.entity.TipoOrdenEntity;

public class Utils {

	public static Orden convertOrdenToDomain(OrdenEntity entity) {
		Orden orden = new Orden();
		orden.setOrdenId(entity.getOrdenId());
		orden.setEstado(entity.getEstado());
		orden.setTipoOperacion(entity.getTipoOperacion());
		
		orden.setEspecie(EspecieDB.convertEntityToDomain(entity.getEspecie()));
		orden.setTipoOrden(convertTipoOrdenToDomain(entity.getTipoOrden()));
		
		return orden;
	}
	
	public static TipoOrden convertTipoOrdenToDomain(TipoOrdenEntity entity) {
		TipoOrden tipoOrden = new TipoOrden();
		tipoOrden.setTipoOrdenId(entity.getTipoOrdenId());
		tipoOrden.setTipoCantidad(entity.getTipoCantidad());
		tipoOrden.setCantidad(entity.getCantidad());
		tipoOrden.setModalidad(entity.getModalidad());
		tipoOrden.setPlazo(entity.getPlazo());
		return tipoOrden;
	}
}
