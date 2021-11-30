package misClases;

import java.util.*;


import java.math.*;

public class Cilindro {
	/*
	 * Author Nordevelop
	 */
	private float radio; //objetos encapsulados con acceso restringido en la clase Main(
	private float altura; 
	public Cilindro (float g, float h )
	{
	this.radio= g;
	this.altura=h;
	}
	public float Dar_Area_Cilindro() //metodo area del Cilindro
	{
		return (float) (2*Math.PI*(radio + altura)); //2pi*(r+h)
	}
	public float Dar_Volumen_Cilindro() //Metodo Volumen del Cilindro
	{
	return (float) (Math.PI*Math.pow(this.radio, 2)*altura); //pi * r**2
	}
	
}
