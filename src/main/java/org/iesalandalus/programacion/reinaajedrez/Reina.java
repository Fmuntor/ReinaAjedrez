package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class Reina {
    Color color;
    Posicion posicion;
    public Color getColor() {
        return color;
    }
    private void setColor(Color color) {
        this.color = color;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public void Reina() {
        this.color = Color.BLANCO;
        this.posicion=setPosicion(1,'d');
    }
    public Reina(Color color){
        if (color==color.BLANCO){
            setPosicion(1,'d');
        }else{
            setPosicion(8,'b');
        }
    }
    public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
        if(direccion==null){
            throw new IllegalArgumentException("Error: Dirección vacía.");
        }
        if(pasos <1 | pasos >7){
            throw new OperationNotSupportedException("Error: El numero introducido es menor que 1 o mayor que 7.");
        }
        
    }
    @Override
    public String toString() {
        return "Reina [color=" + color + ", posicion=" + posicion + "]";
    }
}

