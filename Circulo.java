package misClases;

import java.math.*;

import java.util.*;

public class Circulo {
	private double radio1;
	private Stack<float>Pila_circulo()=null,
	public Circulo{ // metodo constructor (double k)
	
		this.radio1= k;
		Pila_Circulo = new Stack<float>();
	}
    public double Dar_Perimetro_Circulo()
    {
    	return (double) Math.PI*2*radio1; // radio1 para no repetir el objeto de la clase cilindro
    }
    public double Dar_Superficie_Circulo() //DarSuperficie1 para no repetir el metodo del cuadrado
    {
    	return (float) Math.PI*Math.pow(radio1, 2);
    }
}
