package views;
import java.util.Scanner;
public class MainTaller {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Selecciona una opción (1-4):");
    System.out.println("1. Ejercisio 1");
    System.out.println("2. Ejersicio 2");
    System.out.println("3. Ejercisio 3");
    System.out.println("4. Ejercisio 4");

    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Has seleccionado Ejercisio 1");
            ejecutarFolder1();
            break;
        case 2:
            System.out.println("Has seleccionado Ejercisio 2");
            ejecutarFolder2();
            break;
        case 3:
            System.out.println("Has seleccionado Ejercisio 3");
            ejecutarFolder3();
            break;
        case 4:
            System.out.println("Has seleccionado Ejercisio 4");
            ejecutarFolder4();
            break;
        default:
            System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 4.");
    }

    scanner.close();
}

public static void ejecutarFolder1() {
    System.out.println("Ejecutando acciones del Ejercisio 1...");

}

public static void ejecutarFolder2() {
    System.out.println("Ejecutando acciones del Ejercisio 2...");
    
}

public static void ejecutarFolder3() {
    System.out.println("Ejecutando acciones del Ejercisio 3...");
    
}

public static void ejecutarFolder4() {
    System.out.println("Ejecutando acciones del Ejercisio 4...");
    
  }
}

