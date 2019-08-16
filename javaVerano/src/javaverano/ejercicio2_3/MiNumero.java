/*
 * Escribe una clase llamada MiNumero que calcule el doble, el triple y
 * el cuadruple de un numero y permita sumarlo y restarlo con otro numeros.
*/

package javaverano.ejercicio2_3;

/**
 *
 * @author Alberto Martinez
 */

public class MiNumero {
    
    private int miNum;
    
    // Constructor sin parametros, establece MiNum a 0
    public MiNumero() {
        miNum = 0;
    }
    // Constructor con parametros, para establecerlo por teclado
    public MiNumero(int num) {
        miNum = num;
    }
    
    // Metodo que asigna un nuevo valor a miNum
    public void cambiaMiNum(int num) {
        miNum = num;
    }
    // Metodo que suma una cantidad a miNum
    public void suma(int num) {
        miNum = miNum + num;
    }
    // Metodo que resta una cantidad a miNum
    public void resta(int num) {
        miNum = miNum - num;
    }
    // Metodo que devuelve el valor actual de miNum
    public int getValor() {
        return miNum;
    }
    // Metodo que devuelve el doble del valor de miNum
    public int getDoble() {
        return miNum * 2;
    }
    // Metodo que devuelve el triple del valor de miNum
    public int getTriple() {
        //return miNum * 3;
        return getDoble() + getValor();
    }
    // Metodo que devuelve el cuadruple del valor de miNum
    public int getCuadruple() {
        //return miNum * 4;
        return getDoble() * 2;
    }
    
}