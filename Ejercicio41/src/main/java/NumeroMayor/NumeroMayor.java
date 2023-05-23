
package NumeroMayor;


public class NumeroMayor {
     public static double Calcular_Mayor (
    double a,
    double b,
    double c)
    
   {
   double solucion;
    if (a>b & a>c){
        solucion = a;
    }
    else if (b>c){
        solucion = b;
   }else {
        solucion= c;}
        
        
    return solucion;
        
        
        
        }
   }

