package misClases;
import java.util.Stack;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//============================================================================
		// Files      : inicio.java triangulo.java cuadrado.java
		//    Files     : Rectangulo.java Circulo.java Cilindro.java Caja Rectangular.java
		//    File Aux:
		// Author      : Nordevelop
		// Version     :2.1.8
		// language Prog  : Java
		// Description : figuras geometricas con 8 clases. implement.  8 pilas(Stack)
		//============================================================================================
		Scanner entra=new Scanner(System.in);
		Triangulo t=null; //clases
		Cuadrado d=null;
		Rectangulo r=null;
		Cilindro l=null;
		Circulo p=null;
		CajaRectangular q=null;
		Cubo s=null;
		Esfera z=null;
		int a,b,c,m,n,o,lado4,lado5,lado6,largo,alto,ancho,op = 0;
		float radio,radio2,altura,g,h,i,j,v;
		double lado7,radio1,k, u;
		//Stack<Triangulo> Pila_Triangulo=new Stack<Triangulo>();
		//Stack<Cuadrado> Pila_Cuadrado = new Stack<Cuadrado>();
		//Stack<Rectangulo>Pila_Rectangulo = new Stack<Rectangulo>();
		//Stack<Circulo>Pila_Circulo = new Stack<Circulo>();
		//Stack<Cilindro>Pila_Cilindro = new Stack<Cilindro>();
		//Stack<CajaRectangular>Pila_Rectangular= new Stack<CajaRectangular>();
		//Stack<Cubo>Pila_Cubo= new Stack<Cubo>();
		//Stack<Esfera>Pila_Esfera= new Stack<Esfera>();
		do
		{
		    System.out.println("Elija la opcion a continuacion");
		    System.out.println("1-Triangulo. 2-Cuadrado. 3-Rectangulo.4-Caja Rectangular.-5.-Cubo.6-Circulo.7-Cilindro. 8-Esfera.0-Para terminar");
		      op=entra.nextInt();
			    if (op ==1) {
		        	 System.out.println("Ingrese lado 1: ");
				 a=entra.nextInt();
				 System.out.println("Ingrese lado 2: ");
				   b=entra.nextInt();
				 System.out.println("Ingrese lado 3: ");
				   c=entra.nextInt();
				  if(Triangulo.FormaTriangulo(a, b, c)) {
				      t=new Triangulo(a,b,c);
				      Pila_Triangulo.push(t);
				    }
				    else {
				       System.out.println("No se puede formar un Triangulo con: " + a+" - " + b + " - "+ c + " como lados");
				       System.out.println("****************************************************************");
				    }
				    }
				    if (op==2){
				    System.out.println("Ingrese un lado del Cuadrado: ");
				    lado4=entra.nextInt();
				    d=new Cuadrado(lado4);
				    Pila_Cuadrado.push(d);
				    }
				    if (op==3) {
				    System.out.println("Ingrese 1er lado del Rectangulo: ");
				    lado5=entra.nextInt();
				    System.out.println("Ingrese 2do lado del Rectangulo: ");
				    lado6=entra.nextInt();
				    r=new Rectangulo(lado5,lado6);
				    Pila_Rectangulo.push(r);
				    }
				    if (op==4) {
				    	System.out.println("Ingrese el largo de la Caja Rectangular: ");
				    	largo=entra.nextInt();
				    	System.out.println("Ingrese el ancho de la Caja Rectangular: ");
				    	 ancho=entra.nextInt();
				    	System.out.println("Ingrese el alto de la Caja Rectangular: "); 
				    	 alto=entra.nextInt();
				    	q= new Caja_Rectangular(largo, ancho, alto);
				    	Pila_Rectangular.push(q);
				    }
				    if (op==5) {
				    	System.out.println("Ingrese  lado del Cubo: ");
					    lado7=entra.nextDouble();
					    s= new Cubo(lado7);
					     Pila_Cubo.push(s);
				    }
				    if (op==6) {
				    	System.out.println("Ingrese Radio del Circulo: ");
				    	radio1=entra.nextDouble();
				    	p= new Circulo(radio1);
				    	Pila_Circulo.push(p);
				    
				    }
				    if (op==7) {
				    	System.out.println("Ingrese Radio Del Cilindro: ");
					    radio=entra.nextFloat();
					    System.out.println("Ingrese Altura del Cilindro: ");
					    altura=entra.nextFloat();
					    l=new Cilindro(radio, altura);
					    Pila_Cilindro.push(l);
				    }
				    if (op==8) {
				    	System.out.println("Ingrese Radio de la Esfera: ");
				    	radio2=entra.nextFloat();
				    	z= new Esfera(radio2);
				    	Pila_Esfera.push(z);
				    }
				}while(op!=0);
				
			while(!Pila_Triangulo.empty()) //REF Si la pila esta vacia
				{
				   t=Pila_Triangulo.pop();
				   System.out.println("Se formo un triangulo " + t.Soy_Tipo() + " cuyo perimetro es:" + t.Dar_Perimetro_Triangulo());
				   System.out.println("****************************************************************");
		           System.out.println("La Pila de Triangulos ahora tiene " + Pila_Triangulo.size() +" "+ "Triangulos");
				}
		           System.out.println("********************************************************************");
		        
		        while (!Pila_Cuadrado.empty()) //REF pila
		        {
		        d=Pila_Cuadrado.pop();
		        System.out.println("Se Formo un Cuadrado Cuyo Perimetro tiene: " +d.dar_Perimetro_Cuadrado()+"//"+"Su Superficie es de: "+ d.dar_Area_Cuadrado());
		        System.out.println("********************************************************************");
		        System.out.println("La Pila de Cuadrados ahora tiene: "+ Pila_Cuadrado.size()+" "+"Cuadrados");
		        }
		        System.out.println("****************************************************************");
		        while(!Pila_Rectangulo.empty()) //REF pila
		        {
		           r=Pila_Rectangulo.pop();
		           System.out.println("Se formo un Rectangulo cuyo Perimetro tiene: "+r.dar_Perimetro_Rectangulo()+"//"+"Su superficie es de:" + r.dar_Superficie_Rectangulo());
		           System.out.println("********************************************************************");
		           System.out.println("La Pila de Rectangulos ahora tiene: " + Pila_Rectangulo.size()+ " " +"Rectangulos");
		           System.out.println("********************************************************************");
		        }
		        while (!Pila_Rectangular.isEmpty())
		        {
		        	q=Pila_Rectangular.pop();
		        	System.out.println("Se formo una caja Rectangular cuya Area tiene: "+q.Dar_Area_CajaRectangular()+ "//"+"Cuyo Volumen tiene: "+q.Dar_Volumen_CajaRectangular());
		        	   System.out.println("****************************************************************");
		        	   System.out.println("La Pila de Cajas Rectangulares ahora tiene: " + Pila_Rectangular.size()+" "+ "Cajas Rectangulares");
		        	   System.out.println("********************************************************************");
		        }    
		        while (!Pila_Cubo.isEmpty())
		        {
		        	s=Pila_Cubo.pop();
		        	System.out.println("se formo un Cubo cuya Area tiene: "+ s.Dar_Area_Cubo()+"//"+" "+"Cuyo Volumen tiene: "+s.Dar_Volumen_Cubo());
		        	System.out.println("********************************************************************");
		        	System.out.println("La Pila de Cubos ahora tiene: "+Pila_Cubo.size()+" "+ "Cubos");
		        	System.out.println("********************************************************************");
		        }
		        while (!Pila_Circulo.isEmpty()) //REF pila
		        {
		        	p=Pila_Circulo.pop();
		        	 System.out.println("Se Formo un Circulo cuyo Perimetro tiene: " + p.Dar_Perimetro_Circulo()+"//"+"Cuya Area es de: " + p.Dar_Superficie_Circulo());
		             System.out.println("La Pila de Circulos ahora tiene: " + Pila_Circulo.size() +" "+ "Circulos");
		             System.out.println("********************************************************************");
		        }     
		        while(!Pila_Cilindro.isEmpty()) //REF pila
		        {
		           l=Pila_Cilindro.pop();
		           System.out.println("Se Formo un Cilindro cuyo Area tiene: "+ l.Dar_Area_Cilindro()+"//"+ "Cuyo Volumen tiene: " + l.Dar_Volumen_Cilindro());
		           System.out.println("****************************************************************");
		           System.out.println("La Pila de Cilindros ahora tiene: " + Pila_Cilindro.size() +" "+"Cilindros");
		           System.out.println("********************************************************************");
		         }
		        while (!Pila_Esfera.isEmpty()) //REF pila
		        {
		        	z=Pila_Esfera.pop();
		        	System.out.println("Se Formo una Esfera cuya Superficie tiene: " +z.Dar_Superficie_Esfera()+"//"+"Cuyo Volumen tiene: "+z.Dar_Volumen_Esfera());
		        	System.out.println("*************************************************************************************************************************");
		        	System.out.println("La Pila de Esferas ahora tiene: "+ Pila_Esfera.size()+" "+"Esferas");
		        }
		        System.out.println("****************************** Fin Del Programa ******************************");
	}		
	}

