package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto Cuota en la BBDD
		LOG.info("La cuota: "+cuota.getId()+" fue guardada ");

	}

	@Override
	public Cuota mostrar() {
		// Accion para mostrar una cuota
		return cuota;
	}

	@Override
	public void eliminar() {
		// Accion ejecutada para eliminar un objeto Cuota en la BBDD
		LOG.info("La cuota: "+cuota.getId()+" fue eliminada ");

	}

	@Override
	public Cuota modificar() {
		// Accion ejecutada para modificar un objeto Cuota en la BBDD
		LOG.info("La cuota: "+cuota.getId()+" fue guardada ");
		return cuota;
	}

}
