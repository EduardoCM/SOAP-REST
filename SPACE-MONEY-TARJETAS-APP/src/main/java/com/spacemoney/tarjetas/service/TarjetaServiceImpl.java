package com.spacemoney.tarjetas.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;

import com.spacemoney.tarjetas.model.Tarjeta;
import com.spacemoney.tarjetas.repository.TarjetaRepository;
import com.spacemoney.tarjetas.repository.TarjetaRepositoryImpl;


public class TarjetaServiceImpl implements TarjetaService {
	
	private TarjetaRepository repository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		return repository.creartarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return repository.obtenerTarjetas();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return repository.obtenerTarjeta(numeroTarjeta);
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		repository.eliminarTarjeta(numeroTarjeta);
	}

	@Override
	public Tarjeta actualizarTarjeta(Tarjeta tarjeta) {
		return repository.actualizarTarjeta(tarjeta);
	}

	@Override
	public void eliminarTodos() {
		repository.eliminarTodos();
		
	}

}
