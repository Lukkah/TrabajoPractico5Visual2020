package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Equipo;

@Repository("equipoImp")
public class EquipoImp implements IEquipo {

	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto equipo en la BBDD
		LOG.info("El equipo: "+equipo.getNombre()+" fue guardado ");

	}

	@Override
	public Equipo mostrar() {
		//Mostrar los datos del equipo
		return equipo;
	}

	@Override
	public void eliminar() {
		// Accion que elimina un equipo de la BBDD
		LOG.info("El equipo: "+equipo.getNombre()+" fue eliminado ");

	}

	@Override
	public Equipo modificar() {
		// Accion para modificar un equipo
		LOG.info("El equipo: "+equipo.getNombre()+" fue modificado ");
		return equipo;
	}

}
