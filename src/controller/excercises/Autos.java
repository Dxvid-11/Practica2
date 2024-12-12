package controller.excercises;
import java.util.Scanner;

class Empleado {
    String nombre;
    int autosVendidos;
    double totalVentas;

    
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.autosVendidos = 0;
        this.totalVentas = 0.0;
    }

    
    public void registrarVenta(double precio) {
        if (precio > 10000) {
            this.autosVendidos++;
            this.totalVentas += precio;
        }
    }

    
    public double calcularSueldo() {
        double sueldoBase = 2500.0;
        double comisionPorAuto = this.autosVendidos * 250.0; 
        double comisionPorVentas = this.totalVentas * 0.05; 
        return sueldoBase + comisionPorAuto + comisionPorVentas;
    }

    
    public void mostrarInforme() {
        double sueldoBase = 2500.0;
        double comisionPorAuto = this.autosVendidos * 250.0; 
        double comisionPorVentas = this.totalVentas * 0.05; 

        System.out.println("Informe de " + nombre + ":");
        System.out.println("Sueldo base: $" + sueldoBase);
        System.out.println("Número total de autos vendidos: " + this.autosVendidos);
        System.out.println("Valor total de autos vendidos: $" + this.totalVentas);
        System.out.println("Comisión por autos vendidos: $" + comisionPorAuto);
        System.out.println("Comisión por ventas (5%): $" + comisionPorVentas);
        System.out.println("Total a pagar: $" + calcularSueldo());
        System.out.println("---------------------------------------");
    }
}
public class Autos {
    //public static void main(String[] args) { 
        public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        Empleado empleado = new Empleado(nombre);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el valor de la venta del automóvil (0 para terminar): ");
            double precioVenta = scanner.nextDouble();

            if (precioVenta == 0) {
                continuar = false;
            } else {
                empleado.registrarVenta(precioVenta);
            }
        }

        empleado.mostrarInforme();

        scanner.close();
    }
}