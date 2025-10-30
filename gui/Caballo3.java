package hola;

import javax.swing.JProgressBar;

public class Caballo3 extends Thread {
	
	String nombre;
	int tope;
	JProgressBar caballo;
	
	
	public Caballo3(String nombre, int tope, JProgressBar caballo) {
		super();
		this.nombre = nombre;
		this.tope = tope;
		this.caballo = caballo;
		this.caballo.setValue(0);
	}



	public void run() {
		
		for(int i=0; i<=this.tope; i=i+1) {
			
			try {
				sleep((int) Math.random()*2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.caballo.setValue(i);
			
			//System.out.println(this.nombre + " :"+(i));
		}
		
	}

}











