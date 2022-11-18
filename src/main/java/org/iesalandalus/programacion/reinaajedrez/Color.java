package org.iesalandalus.programacion.reinaajedrez;
public enum Color{
	BLANCO("Blanco"),
	NEGRO("Negro");
	private String color;
	private Color(String color){
		this.color = color;
	}
	public String cadenaAMostrar(){
		return this.color;
	}

}

