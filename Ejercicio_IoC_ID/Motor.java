package Ejercicio_IoC_ID;

public class Motor {
	private int cilindraje;

	public Motor(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public void encender() {
		System.out.println("El motor de " + cilindraje + " cc se ha encendido.");
	}
}
