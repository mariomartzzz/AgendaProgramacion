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
		String d = ".";
		// while(d!=""){
		System.out.println("Introduce la descripción del teléfono");
		d = s.next();
		// if(d=="")
		// break;
		System.out.println("Introduce el prefijo del teléfono");
		String p = s.next();
		int prefijo = Integer.parseInt(p);
		System.out.println("Introduce el número de teléfono");
		String t = s.next();
		int numero = Integer.parseInt(t);
		a.addTelefono(d, prefijo, numero);
		contactos.add(a);
//		}
		Depurador.trazar(c.toString());
		System.out.println("Se ha agregado el contato " + c + " a la agenda.");
	}

	public static void buscarContacto() {
		System.out.println("Introduce el nombre a buscar:");
		String nombre = s.next();
		String listaResultados = "";
		// Lo hago para que si se busca Jose se encuentre a jOsE.
		for (int i = 0; i < contactos.size(); i++) {
			Depurador.trazar("Se busca en nombre " + nombre + " con " + contactos.get(i));
			String nombreActual = contactos.get(i).getNombre();
			if (nombreActual.toUpperCase() == nombre.toUpperCase()) {
				listaResultados += nombreActual + "\n";
			}
		}
		System.out.println(listaResultados);
	}

}
