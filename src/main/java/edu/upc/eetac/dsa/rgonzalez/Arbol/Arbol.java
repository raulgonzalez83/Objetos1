package edu.upc.eetac.dsa.rgonzalez.Arbol;

public class Arbol {

	String tipo;
	int altura;
	
	public Arbol(int altura) {
		this.altura=altura;
	}
	public Arbol(String tipo) {
		this.tipo=tipo;	
	}
	public Arbol() {
	
	}
	public Arbol(int altura, String tipo) {
		this.altura=altura;
		this.tipo=tipo;
	}
}

