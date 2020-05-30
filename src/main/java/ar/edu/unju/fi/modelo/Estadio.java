package ar.edu.unju.fi.modelo;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Estadio {

	private String nombre;
	private LocalDate fechaFundacion;
	private String ciudad;
	private int capacidad;
	private String direccion;
	
	//CONSTRUCTORES-------------------------------------------------------------------------------------
	/**
	 * Constructor sin parámetros
	 */
	public Estadio() {
	}
	//METODOS-------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	//METODOS ACCESORES----------------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
}
