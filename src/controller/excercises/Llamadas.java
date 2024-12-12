
package controller.excercises;
import java.util.Scanner;


enum Zona {
    AMERICA_DEL_NORTE(12, 2.75),
    AMERICA_CENTRAL(15, 1.89),
    AMERICA_DEL_SUR(18, 1.60),
    EUROPA(19, 3.5),
    ASIA(23, 4.5),
    AFRICA(25, 3.1),
    OCEANIA(29, 3),
    RESTO_DEL_MUNDO(31, 6);

    private final int clave;
    private final double precioPorMinuto;

    Zona(int clave, double precioPorMinuto) {
        this.clave = clave;
        this.precioPorMinuto = precioPorMinuto;
    }

    
    public double obtenerPrecioPorMinuto() {
        return precioPorMinuto;
    }

    public int obtenerClave() {
        return clave;
    }

    public static Zona obtenerZonaPorClave(int clave) {
        for (Zona zona : Zona.values()) {
            if (zona.obtenerClave() == clave) {
                return zona;
            }
        }
        return null; 
    }
}

public class Llamadas{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la clave de la zona geográfica de destino:");
        System.out.println("12 - AMÉRICA DEL NORTE");
        System.out.println("15 - AMÉRICA CENTRAL");
        System.out.println("18 - AMÉRICA DEL SUR");
        System.out.println("19 - EUROPA");
        System.out.println("23 - ASIA");
        System.out.println("25 - ÁFRICA");
        System.out.println("29 - OCEANÍA");
        System.out.println("31 - RESTO DEL MUNDO");
        int clave = scanner.nextInt();
      
        Zona zona = Zona.obtenerZonaPorClave(clave);
        
        if (zona == null) {
            System.out.println("Clave no válida. Intente nuevamente.");
            return;
        }

        
        System.out.println("Ingrese el número de minutos de la llamada:");
        int minutos = scanner.nextInt();

        double costoTotal = minutos * zona.obtenerPrecioPorMinuto();

        
        System.out.println("El costo de la llamada a " + zona.name().replace('_', ' ') + " es: USD " + costoTotal);
        
        
        scanner.close();
    }
}

