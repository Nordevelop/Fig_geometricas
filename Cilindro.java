package misClases;

import java.util.*;


import java.math.*;

public class Cilindro {
	/*
	 * Author Nordevelop
         * encapsular las pilas de todas las figuras en su clases
	 */
	private float radio; //objetos encapsulados con acceso restringido fuera de la clase Cilindro(
	private float altura; 
	public Cilindro (float g, float h ) //clase constructor(g & h (argumentos de los objetos de la clase))
	{
	this.radio= g;
	this.altura=h;
	}
	public float Dar_Area_Cilindro() //metodo area del Cilindro
	{
		return (float) (2*Math.PI*(radio + altura)); //devuelve 2π*(radio+altura)
	}
	public float Dar_Volumen_Cilindro() //Metodo Volumen del Cilindro
	{
	return (float) (Math.PI*Math.pow(this.radio, 2)*altura); //devuelve π * r**2
	}
	
}
