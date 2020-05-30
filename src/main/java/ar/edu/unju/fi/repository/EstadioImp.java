package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto Estadio en la BBDD
		LOG.info("El estadio: "+estadio.getNombre()+" fue guardado ");

	}

	@Override
	public Estadio mostrar() {
		// Accion ejecutada para mostrar los datos del objeto estadio
		return estadio;
	}

	@Override
	public void eliminar() {
		// Accion ejecutada para eliminar un objeto Estadio de la BBDD
		LOG.info("El estadio: "+estadio.getNombre()+" fue eliminado ");

	}

	@Override
	public Estadio modificar() {
		//  Accion ejecutada para modificar un objeto Estadio de la BBDD
		LOG.info("El estadio: "+estadio.getNombre()+" fue modificado ");
		return estadio;
	}

}
