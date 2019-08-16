/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaverano.capitulo02;

/**
 *
 * @author Alberto
 */
public class TemperaturaPrueba {

   public static void main(String[] args) {
        Temperatura convTemp = new Temperatura();
        
        convTemp.setCelsius(100);
        convTemp.setFarenheit(212);
        
        System.out.println(convTemp.tempC + " grados celsius son " + convTemp.celsiusToFarenheit() + " grados Farenheit");
        System.out.println(convTemp.tempF + " grados farenheit son " + convTemp.farenheitToCelsius() + " grados Celsius");
    }
    
}
