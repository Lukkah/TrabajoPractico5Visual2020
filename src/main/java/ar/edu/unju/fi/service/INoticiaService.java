package ar.edu.unju.fi.service;

import ar.edu.unju.fi.modelo.Noticia;

public interface INoticiaService {
	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
}
