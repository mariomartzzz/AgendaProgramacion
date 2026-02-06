package Agenda;

import java.util.HashMap;
import java.util.Scanner;

import Agenda.Contacto.Telefono;
import depurador.Depurador;

public class Agenda {
	private HashMap <Contacto, Telefono> contactos;
	
	public Agenda() {
		Depurador.trazar("Se crea la lista de contactos");
		//Se crea la lista de contactos
		contactos=new HashMap<Contacto,Telefono>();
		Contacto c=new Contacto("Carlos");
		c.addTelefono("Casa", 0034, 985823575);
		
	}
	
	public void agregarContacto(String c, Telefono t) {
		Contacto a=new Contacto(c);
		contactos.put(a, t);
		
	}
	
}
