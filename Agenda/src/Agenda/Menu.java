package Agenda;

import java.util.Scanner;

public class Menu {
	static Scanner s = new Scanner(System.in);

	public static void mostrarMenu() {
		int opcion = -1;
		do {
			System.out.println("Menú de agenda:");
			System.out.println();
			System.out.println("1) Añadir un contacto a la agenda.");
			System.out.println("2) Quitar un contacto de la agenda.");
			System.out.println("3) Consultar un contacto.");
			System.out.println("4) Consultar toda la agenda.");
			System.out.println("0) Salir de la aplicación.");

			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				// variables con primera letra de lo que son junto a t de teléfono.
				System.out.println("Introduce el nombre del contacto");
				String c = s.next();
				Agenda.agregarContacto(c);
				System.out.println("Introduce la descripción del teléfono");
				String dt = s.next();
				System.out.println("Introduce el prefijo del teléfono");
				int pt = s.nextInt();
				System.out.println("Introduce el número de teléfono");
				int nt = s.nextInt();
				Agenda.agregarTelefono(c, dt, pt, nt);
				// variables con primera letra de lo que son junto a e de email.
				System.out.println("Introduce la descripción del email");
				String de = s.next();
				System.out.println("Introduce el email");
				String e = s.next();
				Agenda.agregarEmail(c, de, e);
				break;
			case 2:
				Agenda.borrarContacto();
				break;
			case 3:
				System.out.println("Introduce el nombre a buscar:");
				String nombre = s.next();
				System.out.println(Agenda.buscarContacto(nombre));
				break;
			case 4:
				System.out.println(Agenda.consultarAgenda());
				break;
			default:
				break;

			}

		} while (opcion > 0 && opcion < 5);
	}
}
