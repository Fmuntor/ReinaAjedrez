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
                System.out.println("Has elegido la opción b)Crear reina eligiendo el color.");
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
    public static void mostrarMenuDirecciones(){
        System.out.println("Las direcciones en las que se puede mover la reina son:\na)NORTE\nb)SUR\nc)ESTE\nd)OESTE\ne)NORESTE\nf)NOROESTE\ng)SURESTE\nh)SUROESTE");
    }
    public static Direccion elegirDireccion(){
        System.out.println("Elige una direccion: ");
        String direccion=Entrada.cadena();
        while(direccion=="NORTE" | direccion=="SUR" | direccion=="ESTE" | direccion=="OESTE" | direccion=="NORESTE" | direccion=="NORTOESTE" | direccion=="SURESTE" | direccion=="SUROESTE")
        {switch(direccion){
        
            case "NORTE":
                System.out.println("Has elegido el norte.");
                return "NORTE";
            case "SUR":
                System.out.println("Has elegido el sur.");
                return "SUR";
            case "ESTE":
                System.out.println("Has elegido el este.");
                return "ESTE";
            case "OESTE":
                System.out.println("Has elegido el oeste.");
                return "OESTE";
            case "NORESTE":
                System.out.println("Has elegido el noreste.");
                return "NORESTE";
            case "NOROESTE":
                System.out.println("Has elegido el noroeste.");
                return "NOROESTE";
            case "SURESTE":
                System.out.println("Has elegido el sureste.");
                return "SURESTE";
            case "SUROESTE":
                System.out.println("Has elegido el suroeste.");
                return "SUROESTE";
        }   
    }
    }
    public static int elegirPasos(){
        System.out.println("Escribe el número de pasos a mover: ");
        int pasos=Entrada.entero();
        System.out.println("Te has movido "+pasos+" pasos.");
        return pasos;
    }
    public static void despedida(){
        System.out.println("¡Gracias por jugar!");
    }
}