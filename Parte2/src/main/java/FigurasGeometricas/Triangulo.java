
package FigurasGeometricas;


public class Triangulo {
    
   

public static double calcularArea(double base, double altura) {
return (base * altura / 2);
}

public static double calcularPerimetro(double base, double altura) {
return (base + altura + Triangulo.calcularHipotenusa(altura, base)); 
}


public static double calcularHipotenusa(double altura, double base) {
return Math.pow(base*base + altura*altura, 0.5);
}
 
}

