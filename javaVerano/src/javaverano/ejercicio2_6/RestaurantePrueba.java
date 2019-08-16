package javaverano.ejercicio2_6;

/**
 * @author Alberto Martinez
 */

public class RestaurantePrueba {
    
    public static void main(String[] args) {
        
        //Creamos un restaurante con 4 docenas de huevos y 10 Kg de chorizo
        Restaurante rest = new Restaurante(4, 10);
        
        // Imprimimos el estado actual del stock del restaurante creado
        System.out.println("\nPROBANDO LA CLASE restaurante\n");
        System.out.println("Estado inicial: ");
        System.out.println(" Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizo() + " kg");
        System.out.println(" Nº de platos que se pueden preparar = " + rest.getNumPlatos() + "\n");
        
        // Se añaden 2 docenas de huevos y 9kg de chorizo
        rest.addHuevos(2);
        rest.addChorizos(9);
        // Imprimimos para comprobar
        System.out.println("Estado después de añadir 2 docenas de huevos y 9kg de chorizo");
        System.out.println(" Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizo() + " kg");
        System.out.println(" Nº de platos que se pueden preparar = " + rest.getNumPlatos() + "\n");
        
        // Servimos 5 platos
        rest.sirvePlato();
        rest.sirvePlato();
        rest.sirvePlato();
        rest.sirvePlato();
        rest.sirvePlato();
        
        // Ser comprueba si se han descontado los platos servidos
        System.out.println("Estado despues de servir 5 platos: ");
        System.out.println(" Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizo() + " kg");
        System.out.println(" Nº de platos que se pueden prearar = " + rest.getNumPlatos() + "\n");
     
    }
    
}