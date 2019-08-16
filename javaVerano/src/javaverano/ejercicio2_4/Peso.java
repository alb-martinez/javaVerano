/*
 * Crea una clase llamada Peso con un constructor al que se le pase un peso
 * y la unidad de medida que puede ser libras, onzas, kilogramos o gramos.
 * Y los metodos necesarios para obtener el peso pasado al constructor en
 * libras, onzas y en kilogramos.
*/
package javaverano.ejercicio2_4;

/**
 * @author Alberto Martinez
 */
public class Peso {
    
    private double gramos;
    
    // El constructor recibe la cantidad y la unidad de medida
    // Convierte la unidad que sea en gramos.
    public Peso(double peso, String unidad) {
        if ("gr".equals(unidad)) gramos = peso;
        if ("kg".equals(unidad)) gramos = peso * 1000;
        if ("lb".equals(unidad)) gramos = peso / 0.0022;
        if ("oz".equals(unidad)) gramos = peso / 0.0353;
    }
    
    public double getLibras() {
        return gramos * 0.002205;
    }
    
    public double getOnzas() {
        return gramos * 0.035274;
    }
    
    public double getKilos() {
        return gramos / 1000;
    }
    
    public double getGramos() {
        return gramos;
    }
    
}