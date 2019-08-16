/*
 * Programa para controlar existencias de un restaurante dedicado a servir
 * platos de huevos fritos con chorizo.
 */

package javaverano.ejercicio2_6;

/**
 * @author Alberto Martinez
 */

public class Restaurante {
    
    private int huevos;     // nº de huevos
    private int chorizo;    // chorizo en gramos

    public Restaurante(int docenaHuevos, double kgChorizo) {
        huevos = docenaHuevos * 12; //almacenamos el nº de huevos, no de docenas
        chorizo = (int) (kgChorizo * 1000); //almacenamos la cantidad en gramos
    }
    
    // Metodo que incrementa el número de docenas de huevos
    public void addHuevos (int num) {
        huevos = huevos + (num * 12);
    }
    
    // Metodo que incrementa el número de kilos de chorizo
    // El metodo recibe la cantidad en kg y lo pasamos a gramos
    public void addChorizos (double num) {
        chorizo = (int) (chorizo + (num * 1000));
    }
    
    // Metodo que calcula la cantidad de platos que se pueden servir con el
    // stock actual. El nº max de platos será el menor entre n1 y n2
    public int getNumPlatos () {
        int n1 = huevos / 2;
        int n2 = chorizo / 200;
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }
    
    // Metodo que descuenta stock al servir un plato (plato = 2 huevos y 200gr chorizo
    public void sirvePlato() {
        huevos = huevos - 2;
        chorizo = chorizo - 200;
    }
    
    // Metodo que devuelve el nº total de huevos, no de docenas
    public int getHuevos() {
        return huevos;
    }
    
    public double getChorizo() {
        return ((double) chorizo / 1000);
    }
    
}