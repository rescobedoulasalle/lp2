package hola;

public class Caballo {
	
	String nombre;
	int tope;
	
	
	
	public Caballo(String nombre, int tope) {
		super();
		this.nombre = nombre;
		this.tope = tope;
	}



	public void correr() {
		
		for(int i=0; i<=this.tope; i=i+1) {
			System.out.println(this.nombre + " :"+(i));
		}
		
	}

}
