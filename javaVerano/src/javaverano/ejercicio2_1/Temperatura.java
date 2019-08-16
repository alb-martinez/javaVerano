/*
Clase Temperatura para convertir de grados Celsius a grados Farenheit
Utilizando 2 metodos y un metodo main
 */
package javaverano.ejercicio2_1;

public class Temperatura {
    
    public double tempF, tempC;
    
    public void setFarenheit(double f) {
        tempF = f;
    }
    public void setCelsius(double c) {
        tempC = c;
    }
    
    //convierte grados celsius a grafos farenheit
    public double celsiusToFarenheit () {
        return (1.8 * tempC) + 32;
    }
    
    public double farenheitToCelsius () {
        return (tempF - 32) / 1.8;
    }
}
