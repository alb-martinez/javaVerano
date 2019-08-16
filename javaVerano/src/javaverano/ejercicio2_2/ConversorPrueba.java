package javaverano.ejercicio2_2;
import java.util.Scanner;

/**
 *
 * @author Alberto Martinez
 */
public class ConversorPrueba {
    
    public static void main(String[] args) {
        
        //Solicitar tipo de cambio por teclado
        System.out.println("¿Que tipo de cambio quieres?");
        double tipo;
        //tipo = Double.parseDouble(System.console().readLine());
        Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextDouble();
        
        ConversorDivisas f1 = new ConversorDivisas();
        ConversorDivisas f2 = new ConversorDivisas(tipo);
        double euros = 100.0;
        double libras = 100.0;
        
        System.out.println("Con el tipo de cambio = " + f1.getTipoCambio() + ":");
        System.out.println(euros + " euros son " + f1.euroToLibra(euros) + " libras.");
        System.out.println(libras + " libras son " + f1.libraToEuro(libras) + " euros.\n");
        
        System.out.println("Con el tipo de cambio = " + f2.getTipoCambio() + ": ");
        System.out.println(euros + " euros son " + f2.euroToLibra(euros) + " libras.");
        System.out.println(libras + " libras son " + f2.libraToEuro(libras) + " euros.");
        
    }
}
