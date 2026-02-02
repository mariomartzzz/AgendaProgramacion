package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

import depurador.Depurador;

public class Agenda {
	private ArrayList <Contacto> contactos;
	
	public Agenda() {
		Depurador.trazar("Se crea la lista de contactos");
		//Se crea la lista de contactos
		contactos=new ArrayList<Contacto>();
		Contacto c=new Contacto("Carlos");
		c.addTelefono("Casa", 0034, 985823575);
		
	}
	
}
