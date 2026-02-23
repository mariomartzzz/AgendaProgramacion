package Agenda;

public abstract class Cargador {

	public static void cargarContactos() {
		Agenda.agregarContacto("Manolo");
		Agenda.agregarTelefono("Manolo", "Casa", 34, 987654);
		Agenda.agregarEmail("Manolo", "Trabajo", "direccion1@dominio.es");

		Agenda.agregarContacto("Luisa");
		Agenda.agregarTelefono("Luisa", "Casa", 66, 987654);
		Agenda.agregarEmail("Luisa", "Trabajo", "direccion2@dominio.es");

		Agenda.agregarContacto("Lola");
		Agenda.agregarTelefono("Lola", "Casa", 99, 987654);
		Agenda.agregarEmail("Lola", "Trabajo", "direccion3@dominio.es");

	}
}