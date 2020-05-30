package ar.edu.unju.fi.modelo;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Usuario {
	private long id;
	private String nombre;
	private String apellio;
	private LocalDate fechaNacimiento;
	private String direccion;
	private long dni;
	private LocalDate fechaAlta;
	private String tipo;
	private String password;
	
	//CONSTRUCTORES------------------------------------------------------------------------
	/**
	 * Constructor sin parámetros
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	//MÉTODOS------------------------------------------------------------------------------
	
	
	
	
	
	
	
	//METODOS ACCESORES--------------------------------------------------------------------
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellio() {
		return apellio;
	}


	public void setApellio(String apellio) {
		this.apellio = apellio;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public long getDni() {
		return dni;
	}


	public void setDni(long dni) {
		this.dni = dni;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
