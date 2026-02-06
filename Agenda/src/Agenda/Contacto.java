package Agenda;

import java.util.HashMap;
import depurador.Depurador;

public class Contacto {
	/**
	 * Clase anidada 
	 */
	public class Telefono{
		
		private int prefijo;
		private int numero;
		
		/**
		 * Construstor de los teléfonos que pueda tener el contacto
		 * @param prefijo depende de la provincia
		 * @param numero numero de telefono
		 */
		private Telefono(int prefijo, int numero) {
			this.prefijo=prefijo;
			this.numero=numero;
		}
		
		private void setPrefijo(int prefijo) {
			this.prefijo=prefijo;
		}
		
		private int getPrefijo() {
			return prefijo;
		}
		
		private void setNumero(int numero) {
			this.numero=numero;
		}
		
		private int getNumero() {
			return numero;
		}
		
		public String toString() {
			String prefijo=Integer.toString(this.prefijo);
			String numero=Integer.toString(this.numero);
			return prefijo+numero;
		}
	}
	
	private String nombre, apellidos, email,direccion;
	
	/**
	 * HashMap tiene la forma de una tabla
	 */
	
	private HashMap <String,Telefono>telefonos;
	private HashMap <String, String>emails; 
	
	/**
	 * Constructor del contacto
	 * @param nombre nombre del contacto
	 */
	public Contacto (String nombre) {
		Depurador.trazar("Se crea el contacto con el nombre "+nombre);
		this.nombre=nombre;
		telefonos=new HashMap<String,Telefono>();
		emails=new HashMap<String,String>();
		
	}
	public void addTelefono(String descripcion,int prefijo, int numero) {
		//descripcion.toUpperCase pone descripcion el mayus para evitar confusiones
		telefonos.put(descripcion.toUpperCase(),new Telefono(prefijo, numero));
		
	}
	
	public String toString() {
		String resultado="Contacto:";
		resultado+="\n"+" Nombre: "+nombre;
		resultado+="\n"+ " Teléfono "+telefonos.toString();
		resultado+="\n"+" email "+email;
		return resultado;
	}
	
	public void buscarContacto() {
		
	}
	
}
