package Agenda;

import java.util.Scanner;
public class Menu {
	Agenda a=new Agenda();
	static Scanner s=new Scanner (System.in);
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
		
		opcion=s.nextInt();
		
			switch (opcion) {
			case 1:
				Agenda.agregarContacto();
				break;
			case 2:
				break;
			case 3:
				Agenda.buscarContacto();
				break;
			case 4:
				break;
			default:
				break;
				
			}
		
	}while(opcion>0 && opcion<5);
}
}
