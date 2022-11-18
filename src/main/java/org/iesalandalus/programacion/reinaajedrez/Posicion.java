package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
    private int fila;
    private char columna;
    
    public void setFila(int fila){
        if(fila<=0 | fila>=9){
            throw new IllegalArgumentException("Fila incorrecta.");
        }
        else{
            this.fila = fila;
        }
    }
    public void setColumna(String columna){
        switch (columna) {
            case "a":
                this.columna=columna.charAt(0);
                break;
            case "b":
                this.columna=columna.charAt(0);
                break;
            case "c":
                this.columna=columna.charAt(0);
                break;
            case "d":
                this.columna=columna.charAt(0);
                break;
            case "e":
                this.columna=columna.charAt(0);
                break;
            case "f":
                this.columna=columna.charAt(0);
                break;
            case "g":
                this.columna=columna.charAt(0);
                break;
            case "h":
                this.columna=columna.charAt(0);
                break;
            default:
            throw new IllegalArgumentException("Fila incorrecta.");
        }
    }
    public int getFila(){
        return this.fila;
    }
    public char getColumna(){
        return this.columna;
    }
    




}
