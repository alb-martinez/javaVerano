package javaverano.ejercicio2_3;

import java.util.Scanner;

/**
 *
 * @author Alberto Martinez
 */

public class MiNumeroPrueba {
    
    public static void main(String[] args) {
        
        // Crea un objeto MiNumero con valor 0
        MiNumero n1 = new MiNumero();
    
        // Crea un objeto MiNumero con el valor recogido por teclado
        System.out.println("Escribe un numero entero: ");
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        MiNumero n2 = new MiNumero(numero);
        
        // Operaciones con miNum
        n1.cambiaMiNum(5);          // Asigna un nuevo valor (5) a miNum n1
        n1.resta(1);                // Resta 1 al valor de n1 - ahora vale 4
        n2.suma(n1.getValor());     // Suma a n2 el valor de n1
        
        System.out.println("OPERACIONES PREVIAS");
        System.out.println("Se cambia el valor de n1 a 5");
        System.out.println("Se resta 1 al valor de n1");
        System.out.println("Se suma a n2 el valor de n1");
        
        System.out.println("\n\nPROBANDO LA CLASE miNumero\n");
        
        System.out.println("NÚMERO n1");
        System.out.println(" Valor actual = " + n1.getValor());
        System.out.println(" Doble = " + n1.getDoble());
        System.out.println(" Triple = " + n1.getTriple());
        System.out.println(" Cuadruple = " + n1.getCuadruple() + "\n");
        
        System.out.println("NÚMERO n2");
        System.out.println(" Valor actual = " + n2.getValor());
        System.out.println(" Doble = " + n2.getDoble());
        System.out.println(" Triple = " + n2.getTriple());
        System.out.println(" Cuadruple = " + n2.getCuadruple() + "\n");
    }
}
