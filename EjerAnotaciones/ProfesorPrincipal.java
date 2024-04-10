package EjerAnotaciones;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfesorPrincipal implements Profesor {

    @Value("${profesor.principal.materia}")
    private String materiaPrincipal;

    @Override
    public void enseniar() {
        System.out.println("Soy el profesor principal y enseño " + materiaPrincipal + ".");
    }
}
