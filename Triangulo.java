package misClases;

import java.util.*;

public class Triangulo {
		private TrianguloData data = new TrianguloData();
		public static boolean FormaTriangulo(int l1,int l2, int l3) //Metodo bolean
		{
		return ((l1+l2)>l3 && (l1+l3)>l2 && (l2+l3)>l1);
		}
		public Triangulo(int a, int b, int c)
		{
		this.data.lado1=a;
		this.data.lado2=b;
		this.data.lado3=c;
		}
		public String Soy_Tipo()
		{
		String devolver="ISOSCELES";
		if(this.data.lado1==this.data.lado2 && this.data.lado1==this.data.lado3)
		devolver="EQUILATERO";
		else
		{
		if(this.data.lado1!=this.data.lado2 && this.data.lado1!=this.data.lado3 && this.data.lado2!=this.data.lado3)
		devolver="ESCALENO";
		}
		return devolver;
		}
		public int Dar_Perimetro_Triangulo()
		{
		return (this.data.lado1+this.data.lado2+this.data.lado3);
		}
}
