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

public Posicion(int fila, char columna){
    setFila(fila);
    setColumna(columna);
}

public Posicion (Posicion posicion){
    this.columna=posicion.columna;
    this.fila=posicion.fila;
}
@Override
public int hashCode() {
    int hash = 7;
    hash = 97 * hash + fila;
    hash = 97 * hash + columna;
    return hash;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Posicion other = (Posicion) obj;
    if (fila != other.fila)
        return false;
    if (columna != other.columna)
        return false;
    return true;
}
@Override
public String toString() {
    return "Posicion [fila=" + fila + ", columna=" + columna + "]";
}

}
