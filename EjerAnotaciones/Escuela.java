package EjerAnotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Escuela {
    private final Estudiante estudiante;
    private final Profesor profesorPrincipal;
    private final Profesor profesorSecundario;

    @Autowired
    public Escuela(Estudiante estudiante,
                   @Qualifier("profesorPrincipal") Profesor profesorPrincipal,
                   @Qualifier("profesorSecundario") Profesor profesorSecundario) {
        this.estudiante = estudiante;
        this.profesorPrincipal = profesorPrincipal;
        this.profesorSecundario = profesorSecundario;
    }

    public void realizarActividades() {
        estudiante.saludar();
        profesorPrincipal.enseniar();
        profesorSecundario.enseniar();
    }
}
