
package FigurasGeometricas;


public class Circulo {


public static double calcularArea(double radio) {
return Math.PI*Math.pow(radio,2);
}
/**
* Método que calcula y devuelve el perímetro de un círculo como la 
* multiplicación de pi por el radio por 2 
* @return Perímetro de un círculo
*/
public static double calcularPerimetro(double radio) {
return 2*Math.PI*radio;
}
}
