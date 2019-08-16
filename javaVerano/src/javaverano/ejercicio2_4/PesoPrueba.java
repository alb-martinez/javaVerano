package javaverano.ejercicio2_4;

/**
 * @author Alberto Martinez
 */
public class PesoPrueba {
    
    public static void main(String[] args) {
        
        // Creamos 4 objetos Peso cada uno en una medida de peso distinta
        Peso onzas = new Peso(10, "oz");
        Peso libras = new Peso(10, "lb");
        Peso kilos = new Peso(10, "kg");
        Peso gramos = new Peso(10, "gr");
        
        //Prueba del getter getKilos
        System.out.println("PROBANDO EL MOTEODO getKilos():");
        System.out.println("Diez onzas son " + onzas.getKilos() + " kg.");
        System.out.println("Diez libras son " + libras.getKilos() + " kg");
        System.out.println("Diez kilogramos son " + kilos.getKilos() + " kg");
        System.out.println("Diez gramos son " + gramos.getKilos() + " kg\n");
        
        System.out.println("PROBANDO EL RESTO DE GETTERS");
        System.out.println("Diez kilogramos son " + kilos.getOnzas() + " oz");
        System.out.println("Diez kilogramos son " + kilos.getLibras() + " lb");
        System.out.println("Diez kilogramos son " + kilos.getGramos() + " gr");
        
    }
    
}