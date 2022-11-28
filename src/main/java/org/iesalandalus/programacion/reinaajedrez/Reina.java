package org.iesalandalus.programacion.reinaajedrez;

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
    public Reina() {
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
}

