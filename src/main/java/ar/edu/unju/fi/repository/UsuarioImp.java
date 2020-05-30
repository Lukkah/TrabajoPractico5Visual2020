package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Lucas3605Tp51Application;
import ar.edu.unju.fi.modelo.Usuario;

@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Lucas3605Tp51Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto usuario en la BBDD
		LOG.info("El usuario: "+usuario.getApellio()+", "+usuario.getNombre()+" fue guardado ");

	}

	@Override
	public Usuario mostrar() {
		// Mostrar los datos del usuario
		return usuario;
	}

	@Override
	public void eliminar() {
		// Accion que elimina a un usuario de la BBDD
		LOG.info("El usuario: "+usuario.getApellio()+", "+usuario.getNombre()+" fue eliminado ");

	}

	@Override
	public Usuario modificar() {
		// Accion que modifica a un usuario
		LOG.info("El usuario: "+usuario.getApellio()+", "+usuario.getNombre()+" fue modificado ");
		return usuario;
	}

}
