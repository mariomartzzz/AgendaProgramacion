package Agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Agenda.Contacto.Telefono;
import depurador.Depurador;

public class Agenda {
	static Scanner s = new Scanner(System.in);
	public static ArrayList<Contacto> contactos;

	public Agenda() {
		Depurador.trazar("Se crea la lista de contactos");
		// Se crea la lista de contactos
		contactos = new ArrayList<Contacto>();
	}

	public static void agregarContacto() {

		System.out.println("Introduce el nombre del contacto");
		String c = s.next();
		Contacto a = new Contacto(c);
		System.out.println("Introduce la descripción del teléfono");
		String d = s.next();
		System.out.println("Introduce el prefijo del teléfono");
		String p = s.next();
		int prefijo = Integer.parseInt(p);
		System.out.println("Introduce el número de teléfono");
		String t = s.next();
		int numero = Integer.parseInt(t);
		System.out.println("Introduce la descripcion del email");
		String d2 = s.next();
		System.out.println("Introduce el email");
		String e = s.next();
		a.addEmail(d2, e);
		a.addTelefono(d, prefijo, numero);
		contactos.add(a);
		Depurador.trazar(c.toString());
		System.out.println("Se ha agregado el contato " + c + " a la agenda.");
	}

	public static String buscarContacto(String nombre) {
		// Lo hago para que si se busca Jose se encuentre a jOsE.
		String resultado = "";
		for (int i = 0; i < contactos.size(); i++) {
			Depurador.trazar("Se compara el nombre " + nombre + " con " + contactos.get(i).getNombre());
			String nombreActual = contactos.get(i).getNombre().toUpperCase();
			if (nombreActual.equals(nombre.toUpperCase())) {
				resultado += contactos.get(i).toString() + "\n";
			}
		}
		return resultado;
	}

	public static String consultarAgenda() {
		String resultado = "";
		for (int i = 0; i < contactos.size(); i++) {
			resultado += contactos.get(i).toString() + "\n";
		}
		return resultado;
	}
	public static void borrarContacto() {
		System.out.println("Introduce exactamente el nombre del contacto a borrar:");
		String contactoBorrar=s.next();
		for (int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNombre().equals(contactoBorrar))
				contactos.remove(i);
		}
	}
}
