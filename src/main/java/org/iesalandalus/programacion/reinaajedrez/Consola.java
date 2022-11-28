package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola() {
    }
    public static void mostrarMenu(){
        System.out.println("Seleccione una opcion:\na)Crear reina por defecto.\nb)Crear reina eligiendo el color.\nc)mover.\nd)Salir.");
    }
    public static char elegirOpcionMenu() {
        System.out.print("Elige una opcion: ");
        char opcion=Entrada.caracter();
        while(opcion=='a'| opcion=='b' | opcion=='c' | opcion=='d')
        switch(opcion){
            case 'a':
                System.out.println("Has elegido la opción a)Crear reina por defecto.");
                return 'a';
            case 'b':
                System.out.println("Has elegico la opción b)Crear reina eligiendo el color.");
                return 'b';
            case 'c':
                System.out.println("Has elegido la opcion c)mover.");
                return 'c';
            case 'd':
                System.out.println("Cerrando programa.");
                return 'd';
        }   
}
    public static Color elegirOpcion(){
        System.out.println("Introduce un color: ");
        String color = Entrada.cadena();
        while(color=="BLANCO"| color=="NEGRO"){
            if(color=="BLANCO"){
                return Color.BLANCO;
            }else{
                return Color.NEGRO;
            }
        }
    }
}