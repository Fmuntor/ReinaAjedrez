package org.iesalandalus.programacion.reinaajedrez;
public class MainApp {
	Reina reina;		
	
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
}
