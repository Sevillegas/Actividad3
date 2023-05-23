
package TrianguloEquilatero;


public class CalculoTriangulo {
    public static double Calcular_Perimetro (
    double lado)
            
 { double perimetro;
   perimetro = lado + lado +lado;
   return perimetro;
    
}
    public static double Calcular_Area (
    double lado)
    
    {
    double area;
    area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
    return area;
    }
    public static double Calcular_Altura (
     double lado)
    
    {
    double altura;
    altura = lado * Math.sqrt(3) / 2;
    return altura;
    }
    
}