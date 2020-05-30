package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.modelo.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Lucas3605Tp51Application implements CommandLineRunner{

	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Lucas3605Tp51Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicializo variables del objeto usuario
		usuario.setApellio("Lucas");
		usuario.setDireccion("MB L25");
		usuario.setDni(41409949);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1998, 10, 4));
		usuario.setId(1);
		usuario.setNombre("Fernando");
		usuario.setPassword("nuncaEntiendes");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
	}

}
