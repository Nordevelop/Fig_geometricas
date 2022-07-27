package misClases;
import java.math.*;
import java.util.*;
public class Esfera {
	/*Author Nordevelop
	 * 
	 */
	private float radio2;
	private Stack <float>Pila_Esfera()=null;
	public Esfera(float v) //clase constructor
	{
		this.radio2=v;
		Pila_Esfera = new Stack<float>();
	}
	public float Dar_Superficie_Esfera() //metodo
	{
		return (float) (4*Math.PI*Math.pow(radio2, 2)); //superficie devuelve S= 4πr**2
	}
	public float Dar_Volumen_Esfera()
	{
		return (float)(4*Math.PI*Math.pow(radio2, 3))/3;  //volumen  devuelve V=(4πr**3) / 3
	}
	
	

}
