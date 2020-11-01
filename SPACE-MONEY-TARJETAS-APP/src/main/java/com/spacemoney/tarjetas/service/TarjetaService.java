package com.spacemoney.tarjetas.service;

import java.util.List;

import com.spacemoney.tarjetas.model.Tarjeta;


public interface TarjetaService {

	Tarjeta creartarjeta(Tarjeta tarjeta);

	List<Tarjeta> obtenerTarjetas();

	Tarjeta obtenerTarjeta(String numeroTarjeta);

	void eliminarTarjeta(String numeroTarjeta);

	Tarjeta actualizarTarjeta(Tarjeta tarjeta);
	
	void eliminarTodos();

}
