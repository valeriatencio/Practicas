package Ejercicio_IoC_ID;

public class Automovil {
	private Motor motor;

	public Automovil(Motor motor) {
		this.motor = motor;
	}

	public void arrancar() {
		System.out.println("Arrancando el automóvil...");
		motor.encender();
		System.out.println("El automóvil ha arrancado.");
	}
}
