package misClases;
import java.math.*;

public class Cubo {
	/*objeto emcapsulados con acceso restringido en la clase main()
	 * author Nordevelop
	 */
	private double lado7;
	public Cubo(double u) //u Parametro
	{
		this.lado7=u;
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
