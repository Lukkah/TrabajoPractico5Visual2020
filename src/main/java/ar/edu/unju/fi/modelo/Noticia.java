package ar.edu.unju.fi.modelo;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Noticia {
	private LocalDate fecha;
	private String titulo;
	private String resumen;
	
	
	//CONSTRUCTORES------------------------------------------------------------------------
	/**
	 * Constructor sin parámetros
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	

	//MÉTODOS------------------------------------------------------------------------------
	
	
	
	
	
	
	
	//METODOS ACCESORES--------------------------------------------------------------------
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	
}
