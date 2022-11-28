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
    public Reina(Color color, Posicion posicion) {
        this.color = Color.BLANCO;
        this.posicion=getPosicion('1d');
    }
}

