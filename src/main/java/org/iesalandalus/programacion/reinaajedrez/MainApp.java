package org.iesalandalus.programacion.reinaajedrez;
public class MainApp {
	static Reina reina;		
	public static void main(String[] args) {
	private int ejecutarOpcion(){
		Consola.mostrarMenu();
		char opcion=Consola.elegirOpcionMenu();
		switch(opcion){
			case 'a':Reina.crearReinaDefecto();
			break;
			case 'b':Reina.crearReinaColor();
			break;
			case 'c':Reina.mover();
			break;
			case 'd':mostrarReina();
			break;
		}	
	}
	private static void crearReinaDefecto(){
		reina=new Reina();
	}
	private static void crearReinaColor(){
		reina=new Reina(color);
	}
	private static void mover(){
		reina=Reina.mover();
	}
	private static void mostrarReina(){
		Reina.toString();
	}
}
}
