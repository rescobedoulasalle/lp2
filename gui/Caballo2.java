package hola;

public class Caballo2 extends Thread {
	
	String nombre;
	int tope;
	
	
	
	public Caballo2(String nombre, int tope) {
		super();
		this.nombre = nombre;
		this.tope = tope;
	}



	public void run() {
		
		for(int i=0; i<=this.tope; i=i+1) {
			System.out.println(this.nombre + " :"+(i));
		}
		
	}

}
