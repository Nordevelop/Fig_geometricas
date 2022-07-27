package misClases;
import java.math.*;

public class Cubo {
	/*objeto emcapsulados con acceso restringido fuera de la clase Cubo
	 * author Nordevelop
	 */
	private double lado7;
	private Stack<double>Pila_Cuadrado = null:
	public Cubo(double u) //constructor (u) Parametro
	{
		this.lado7=u;
		Pila_Cuadrado = new Stack<double>();
	}
	/*
	 * Metodos
	 */
	public double Dar_Area_Cubo()
	{
		return (6*Math.pow(lado7, 2));
	}
	public double Dar_Volumen_Cubo()
	{
		return (Math.pow(lado7, 3));
	}

}
