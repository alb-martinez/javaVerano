/*
 * Escribe una clase llamada ConversorDivisas que convierta libras a euros y
 * viceversa, mediante dos metodos llamados librasToEuros() y eurosToLibras().
 * Escribe dos constructores ConversorDivisas() establece el cambio a 0,85.
 * El constructor ConversorDivisas(double) permite configurar el tipo de cambio
 * al crear el objeto. Añadir un main() para comprobar el funcionamiento.
 * Los datos serán introducidor por teclado
 */
package javaverano.ejercicio2_2;

/**
 * @author Alberto Martinez
 */

public class ConversorDivisas {
    private double tipoCambio;
    
    //Constructor sin parametros
    public ConversorDivisas() {
        tipoCambio = 0.85;
    }
    
    //Constructor con parametro para editar el tipo de cambio
    public ConversorDivisas(double tc) {
        tipoCambio = tc;
    }
    
    //Metodo para convertir libras a euros, con redondeo a 2 decimales
    public double libraToEuro (double euro) {
        return formatearDecimales((euro*tipoCambio), 2);
    }
    
    //Metodo para convertir euros a libras, con redondeo a 2 decimales
    public double euroToLibra (double libra) {
        return formatearDecimales((libra/tipoCambio), 2);
    }
    
    //setter y getter para el tipo de cambio
    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tc) {
        this.tipoCambio = tc;
    }
    
    //Metodo para redondear a los decimales que queramos, en este caso 2.
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    
}