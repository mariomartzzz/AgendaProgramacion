package Agenda;

public class Contacto {

	private class Telefono{
		
		private int prefijo;
		private int numero;
		
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
	
	
	
}
