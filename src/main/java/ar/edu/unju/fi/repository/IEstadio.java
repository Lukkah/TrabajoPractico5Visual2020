package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.modelo.Estadio;

public interface IEstadio {
	
	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();
}
