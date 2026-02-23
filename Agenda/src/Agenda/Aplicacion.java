package Agenda;

import depurador.Depurador;

public class Aplicacion {
	
	public Aplicacion() {
		Agenda agenda=new Agenda();
		Cargador.cargarContactos();
		Menu.mostrarMenu();
	}
	
	public static void main(String[] args) {
		new Aplicacion(); 
			
		

	}

}
