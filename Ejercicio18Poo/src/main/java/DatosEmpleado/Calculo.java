package DatosEmpleado;

public class Calculo {
    public static double Calcular_SalarioBruto (
    double horasTrabajadas,
    double valorHoraTrabajada)
            
    {
    double salarioBruto;
    double salarioNeto;
    
    salarioBruto = horasTrabajadas * valorHoraTrabajada;
    return salarioBruto;
    
    }
    
    
   public static double Calcular_SalarioNeto (
    double horasTrabajadas,
    double valorHoraTrabajada,
    double porcentajeRetencion)
            
    {
    double salarioNeto;
    
    salarioNeto =  (horasTrabajadas * valorHoraTrabajada)  * porcentajeRetencion / 100;
    return salarioNeto;
    }
}

