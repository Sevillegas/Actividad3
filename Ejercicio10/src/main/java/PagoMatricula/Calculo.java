
package PagoMatricula;


public class Calculo {
      public static String Nombre_Estudiante (
          String a)
  
  { String nombre;
     nombre = a;
    return nombre;
  
  }
         public static String Numero_Inscripcion (
          String a)
  
  { String nombre;
     nombre = a;
    return nombre;
  
  }     
         
    public static double Pago (
          double estrato,
          double patrimonio)
  
  {  double pago = 50000;
   
  if(patrimonio>2000000 & estrato>3){

         pago= 50000+(0.03*patrimonio);}
       
    return pago;
  
  }  


          
}
