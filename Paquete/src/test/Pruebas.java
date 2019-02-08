package test;

public class Pruebas {
	public static void main(String[] args) {
		paquete1.Persona p = new paquete1.Persona(22, "Maria");
		paquete2.Persona m = new paquete2.Persona(20, "Jose", Masculino);

		System.out.println(p.toString());
		System.out.println(m.toString());

	}
}
