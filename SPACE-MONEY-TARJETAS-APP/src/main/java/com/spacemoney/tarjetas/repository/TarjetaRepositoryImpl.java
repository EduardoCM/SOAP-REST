package com.spacemoney.tarjetas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.spacemoney.tarjetas.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private Logger LOG = Logger.getLogger(TarjetaRepositoryImpl.class.getName());

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<Tarjeta>();

	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setId(1);
		tarjeta.setNombreTitular("Eduardo Castillo Mendoza");
		tarjeta.setNombreEntidad("Banco Space Money");
		tarjeta.setNumeroTarjeta("2222-2222-1111-1111");
		tarjeta.setMarca("SPACE-VISA");
		tarjeta.setFechaCaudicidad("20/26");
		tarjeta.setCvv("234");
		tarjetasDigitales.add(tarjeta);
	}

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		LOG.info("Creacion de tarjeta "+ tarjeta);
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		LOG.info("Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		LOG.info("Obtener tarjeta "+ numeroTarjeta);
		return tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		LOG.info("Eliminar tarjeta "+ numeroTarjeta);
		tarjetasDigitales.remove(
				tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get());
	}

	@Override
	public Tarjeta actualizarTarjeta(Tarjeta tarjeta) {
		LOG.info("Eliminar tarjeta " + tarjeta);
		Tarjeta resultado = tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(tarjeta.getNumeroTarjeta())).findFirst().get();
		return tarjetasDigitales.set(tarjeta.getId(), resultado);
	}

	@Override
	public void eliminarTodos() {
		tarjetasDigitales.clear();
	}

}
