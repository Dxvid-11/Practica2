package controller.excercises;
import java.util.Scanner;

public class FacturaAgua {

    public static double calcularCostoAgua(int consumo) {
        double costo = 0;

        if (consumo <= 15) {
            costo = consumo * 3.00;  
        } else if (consumo <= 25) {
            costo = 15 * 3.00 + (consumo - 15) * 0.10;
        } else if (consumo <= 40) {
            costo = 15 * 3.00 + 10 * 0.10 + (consumo - 25) * 0.20;
        } else if (consumo <= 60) {
            costo = 15 * 3.00 + 10 * 0.10 + 15 * 0.20 + (consumo - 40) * 0.30;
        } else {
            costo = 15 * 3.00 + 10 * 0.10 + 15 * 0.20 + 20 * 0.30 + (consumo - 60) * 0.35;
        }

        return costo;
    }

    public static double aplicarDescuento(double costoAgua, boolean esTerceraEdad, int consumo, double porcentajeDiscapacidad) {
        if (esTerceraEdad) {
            if (consumo <= 15) {
                return costoAgua * 0.50;
            } else {
                
                return costoAgua - (15 * 3.00 * 0.30);  
            }
        } else if (porcentajeDiscapacidad > 0) {
    
            return costoAgua - (15 * 3.00 * (porcentajeDiscapacidad / 100));
        }
        return costoAgua;
    }

    
    public static double calcularImpuestoAlcantarillado(double costoAgua) {
        return costoAgua * 0.35;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el consumo de agua en m³: ");
        int consumo = scanner.nextInt();
        
        System.out.print("¿Es contribuyente de la tercera edad? (true/false): ");
        boolean esTerceraEdad = scanner.nextBoolean();
        
        System.out.print("Ingrese el porcentaje de discapacidad (si no tiene, ingrese 0): ");
        double porcentajeDiscapacidad = scanner.nextDouble();

        double costoAgua = calcularCostoAgua(consumo);
        double costoConDescuento = aplicarDescuento(costoAgua, esTerceraEdad, consumo, porcentajeDiscapacidad);

        double impuestoAlcantarillado = calcularImpuestoAlcantarillado(costoConDescuento);
        double tasaBasura = 0.75;
        double tasaProcesamientoDatos = 0.50;

        double totalPagar = costoConDescuento + impuestoAlcantarillado + tasaBasura + tasaProcesamientoDatos;

        System.out.println("\nDetalle de la factura:");
        System.out.println("Costo del servicio de agua potable: $" + costoConDescuento);
        System.out.println("Impuesto de alcantarillado (35%): $" + impuestoAlcantarillado);
        System.out.println("Tasa por recolección de basura: $" + tasaBasura);
        System.out.println("Tasa por procesamiento de datos: $" + tasaProcesamientoDatos);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
