
package EcuacionesSegundoGrado;


public class Calculo2 {
   public static double Calcular_Ecuacion2 
    (double a, double b, double c)
            
  {    
   double solucion2;
   
   solucion2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
   return solucion2;
   }
   }
    