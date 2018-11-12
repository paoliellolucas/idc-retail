package com.example.idcretail.core.cartera;

import java.util.List;

import com.example.idcretail.core.orden.Orden;

public class DetailedCartera extends Cartera {

	private List<Orden> ordenes;

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}
}
