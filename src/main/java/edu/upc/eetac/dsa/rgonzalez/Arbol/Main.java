package edu.upc.eetac.dsa.rgonzalez.Arbol;

public class Main {
	
	public static void main(String args[])
	{
	Arbol arbol1 = new Arbol(4);
	System.out.println("Un arbol de "+arbol1.altura+" metros");
	Arbol arbol2 = new Arbol(" Roble");
	System.out.println("Un"+arbol2.tipo);
	Arbol arbol3 = new Arbol();
	System.out.println("Un arbol generico");
	Arbol arbol4 = new Arbol(5,"Pino");
	System.out.println("Un "+arbol4.tipo+" de "+arbol4.altura+" metros");
	}
}
