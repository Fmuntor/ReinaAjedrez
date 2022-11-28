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
    public void setColumna(char columna){
        switch (columna) {
            case 'a':
                this.columna=columna;
                break;
            case 'b':
                this.columna=columna;
                break;
            case 'c':
                this.columna=columna;
                break;
            case 'd':
                this.columna=columna;
                break;
            case 'e':
                this.columna=columna;
                break;
            case 'f':
                this.columna=columna;
                break;
            case 'g':
                this.columna=columna;
                break;
            case 'h':
                this.columna=columna;
                break;
            default:
            throw new IllegalArgumentException("Columna incorrecta.");
        }
    }
    public int getFila(){
        return this.fila;
    }
    public char getColumna(){
        return this.columna;
    }

private Posicion(int fila, char columna){
    this.fila=getFila();
    this.columna=getColumna();
}
    




}
