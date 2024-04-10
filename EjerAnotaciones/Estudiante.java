package EjerAnotaciones;

public class Estudiante {
	private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy un estudiante.");
    }
}
