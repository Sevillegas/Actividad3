
package EcuacionesSegundoGrado;


public class Calculo {
    
   public static double Calcular_Ecuacion (
    double a, double b, double c)
    
   {
    double solucion;
   
    solucion = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
    return solucion;
   }
    
   
   }


