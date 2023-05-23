
package MayorMenorIgual;


public class Calculo {
    public static double Calcular_Mayor (      
    double no1,
    double no2)
            
    {
     double mayor;
     
        if(no1>no2){
        mayor = no1; }  
        else{ mayor=no2;
        }
    return mayor;
     }
public static double Calcular_Iguales (      
    double num1,
    double num2)
            
    {
     double igual=0;
     
     
        if(num1==num2){
        igual = num1; }  
        
    return igual;
     }
}