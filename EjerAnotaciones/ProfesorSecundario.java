package EjerAnotaciones;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfesorSecundario implements Profesor {

    @Value("${profesor.secundario.materia}")
    private String materiaSecundaria;

    @Override
    public void enseniar() {
        System.out.println("Soy el profesor secundario y enseño " + materiaSecundaria + ".");
    }
}
