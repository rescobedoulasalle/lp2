//package hola;

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
		
        try {
			Thread.sleep((int) Math.random()*2000);
		    for(int i=0; i<=this.tope; i=i+1) {
				Thread.sleep((int) Math.random()*2000);
			    System.out.println(this.nombre + " :"+(i));
			    this.caballo.setValue(i);
            }	
        }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			
		
		
	}

}

