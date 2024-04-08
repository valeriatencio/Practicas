package Ejercicio_IoC_ID;

public class Main {

	public static void main(String[] args) {
		// Creamos el motor
		Motor motor = new Motor(2000); // Motor de 2000 cc

		// Creamos el automóvil, inyectando el motor
		Automovil automovil = new Automovil(motor);

		// Probamos el automóvil
		automovil.arrancar();
	}
}
