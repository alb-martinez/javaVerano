/*
 * Escribe una clase llamada Distancia con dos metodos para pasar de 
 * millas a metros y de millas a kilometros
 */

package javaverano.ejercicio2_5;

/**
 * @author Alberto Martinez
 */

public class Distancia {
    
    private double distancia;

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    public double millasToMeters() {
        return distancia * 1852;
    }
    
    public double millasToKm() {
        return millasToMeters() / 1000;
    }
    
}