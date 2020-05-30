package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto Resultado en la BBDD
		LOG.info("El resultado de la fecha: "+resultado.getFecha()+" fue guardado ");

	}

	@Override
	public Resultado mostrar() {
		// Accion para mostrar un resultado
		return resultado;
	}

	@Override
	public void eliminar() {
		// Accion ejecutada para eliminar un objeto Resultado en la BBDD
		LOG.info("El resultado de la fecha: "+resultado.getFecha()+" fue eliminado ");
	}

	@Override
	public Resultado modificar() {
		// Accion ejecutada para modificar un objeto Resultado en la BBDD
		LOG.info("El resultado de la fecha: "+resultado.getFecha()+" fue modificado ");
		return resultado;
	}

}
