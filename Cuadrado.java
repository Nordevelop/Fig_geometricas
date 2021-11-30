package misClases;

public class Cuadrado {
	private int lado4;
	public Cuadrado(int d)
	{
	this.lado4=d;
	}
	public int dar_Area_Cuadrado()
	{
	return (this.lado4*this.lado4);
	}
	public int dar_Perimetro_Cuadrado()
	{
	return(this.lado4*4);
	}
}
