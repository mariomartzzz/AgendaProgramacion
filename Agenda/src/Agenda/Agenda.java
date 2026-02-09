package Agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Agenda.Contacto.Telefono;
import depurador.Depurador;

public class Agenda {
	static Scanner s=new Scanner(System.in);
	public ArrayList <Contacto>contactos;
	
	public Agenda() {
		Depurador.trazar("Se crea la lista de contactos");
		//Se crea la lista de contactos
		contactos=new ArrayList<Contacto>();
				
	}
	
	public static void agregarContacto() {
		
		System.out.println("Introduce el nombre del contacto");
		String c=s.next();
		Contacto a=new Contacto(c);
		while(!s.equals(null)){
			System.out.println("Introduce la descripción del teléfono");
			String d=s.next();
			if(d=="")
				break;
			System.out.println("Introduce el prefijo del teléfono");
			String p=s.next();
			int prefijo = Integer.parseInt(p); 
			System.out.println("Introduce el número de teléfono");
			String t=s.next();
			int numero = Integer.parseInt(t); 
			a.addTelefono(d, prefijo, numero);
		}
		System.out.println(a.toString());
	}
	
}
