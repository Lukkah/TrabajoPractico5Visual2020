package ar.edu.unju.fi.modelo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Clase referida al equipo
 * @author Fernando
 *
 */
@Component
public class Equipo {
	private String nombre;
	@Autowired
	private Estadio estadio;
	//CONSTRUCTORES------------------------------------------------------------------------
	/**
	 * Constructor sin parámetros
	 */
	public Equipo() {
		estadio = new Estadio();
	}
	
	
	
	//MÉTODOS------------------------------------------------------------------------------
	
	
	
	
	
	
	
	//METODOS ACCESORES--------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
}
