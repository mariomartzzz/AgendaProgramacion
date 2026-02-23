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

	public static void agregarContacto(String nombre) {

		Contacto a = new Contacto(nombre);
		
		
		contactos.add(a);
		System.out.println("Se ha agregado el contato " + nombre + " a la agenda.");
	}

	public static void agregarTelefono (String nombre, String descripcion, int prefijo, int numero) {
	
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNombre().equals(nombre))
				contactos.get(i).addTelefono(descripcion, prefijo, numero);
		}
	}
	
	public static void agregarEmail(String nombre, String descripcion, String correo) {
		
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNombre().equals(nombre))
				contactos.get(i).addEmail(descripcion, correo);
		}
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
