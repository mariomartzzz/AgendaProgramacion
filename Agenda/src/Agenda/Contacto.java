package Agenda;

public class Contacto {

		Telefono telefono;
		String nombre;
		String apellidos;
		
	public Contacto(String nombre, String apellidos, Telefono telefono) {
		
	}	
		
	public void addContacto(String nombre,String apellidos,Telefono telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
	}

}
