package misClases;

public class CajaRectangular {
	/*objetos emcapsulados con acceso restringido fuera de la clase
	 * 
	 */
	private int largo;  //b largo*ancho
	private int ancho;//c
	private int alto;   //a
	
public CajaRectangular (int m, int n, int o) { //class constructor
	//objetos con acceso permitido fuera de la clase
	
	this.largo=m;
	this.ancho=n;
	this.alto=o;
	}
public int Dar_Area_CajaRectangular() //metodo para hallar en area
{
	return (2*this.alto*this.largo+2*this.alto*this.ancho+2*this.largo*this.ancho);
}
public int Dar_Volumen_CajaRectangular()//metodo para hallar el volumen
{
	return (this.largo*this.ancho*this.alto);  //V=LAA
}
}
