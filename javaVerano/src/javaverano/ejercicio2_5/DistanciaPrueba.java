package javaverano.ejercicio2_5;

import java.util.Scanner;

/**
 * @author Alberto Martinez
 */
public class DistanciaPrueba {
    
    public static void main(String[] args) {
        double millas;
        
        // Obtenemos la cantidad de millas introducidas por consola
        System.out.println("INTRODUCE UNA CANTIDAD DE MILLAS: ");
        Scanner teclado = new Scanner(System.in);
        millas = teclado.nextDouble();
        
        // Se crea un objeto Distancia con la cantidad introducida
        Distancia d1 = new Distancia(millas);
        
        // Se comprueba funcionamiento de los metodos
        System.out.println(millas + " millas son " + d1.millasToKm() + " kilometros");
        System.out.println(millas + " millas son " + d1.millasToMeters() + " metros");
        
    }
    
}