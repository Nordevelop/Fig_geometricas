package misClases;

import java.util.*;

public class Rectangulo {
private int lado5;//encapsulamiento de objetos
private int lado6;
public Rectangulo (int e, int f)
{
this.lado5=e;//argumentos
this.lado6=f;
}
public int dar_Perimetro_Rectangulo() //Metodo para hallar el perimetro del cuadrado
{
return (this.lado5*2+this.lado6*2); //l1 * 2 + l2 *2
}
public int dar_Superficie_Rectangulo()
{
return (this.lado5*this.lado6);
}
}
