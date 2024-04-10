package EjerAnotaciones;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("EjerAnotaciones")
@PropertySource("classpath:escuela.properties")
public class EscuelaConfig {
	@Value("${estudiante.nombre}")
	private String nombreEstudiante;

	@Value("${profesor.principal.materia}")
	private String materiaPrincipal;

	@Value("${profesor.secundario.materia}")
	private String materiaSecundaria;

	@Bean
	public Estudiante estudiante() {
		return new Estudiante(nombreEstudiante);
	}

	@Bean
	public Profesor profesorPrincipal() {
		return new ProfesorPrincipal();
	}

	@Bean
	public Profesor profesorSecundario() {
		return new ProfesorSecundario();
	}

}
