
package SalarioTrabajo;


public class Salario {
    public static double Calcular_Salario (      
    double horasTrabajadas,
    double salarioHora       
    )
            
    { double salarioMensual;
    
    
       if ( horasTrabajadas * salarioHora > 450000){
            salarioMensual = horasTrabajadas * salarioHora;}
       
       else {salarioMensual= 0;}     
     
       return salarioMensual;
    }       
            
  public static String Nombre_Empleado (
          String a)
  
  { String nombre;
     nombre = a;
    return nombre;
  
  }
           
}
