package EjerAnotaciones;

public class EscuelaMain {

	public static void main(String[] args) {
		EscuelaConfig escuelaConfig = new EscuelaConfig();
        Escuela escuela = new Escuela(escuelaConfig.estudiante(),escuelaConfig.profesorPrincipal(),escuelaConfig.profesorSecundario());
        escuela.realizarActividades();
	}

}
