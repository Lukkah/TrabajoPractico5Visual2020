package ar.edu.unju.fi.service;

import ar.edu.unju.fi.modelo.Usuario;

public interface IUsuarioService {

	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
}
