package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Noticia;

@Repository("noticiaImp")
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto Noticia en la BBDD
		LOG.info("La noticia: "+noticia.getTitulo()+" fue guardada ");

	}

	@Override
	public Noticia mostrar() {
		// Accion para mostrar un objeto Noticia
		return noticia;
	}

	@Override
	public void eliminar() {
		//Accion ejecutada para eliminar un objeto Noticia en la BBDD
		LOG.info("La noticia: "+noticia.getTitulo()+" fue eliminada ");
	}

	@Override
	public Noticia modificar() {
		//Accion ejecutada para modificar un objeto Noticia en la BBDD
		LOG.info("La noticia: "+noticia.getTitulo()+" fue modificada ");
		return noticia;
	}

}
