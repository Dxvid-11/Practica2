
package controller.excercises;
import java.util.Scanner;

public class Serie {
    
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos a calcular: ");
        int n = scanner.nextInt();

        double resultado = 0.0;
        int denominador = 1; 
        int exponente = 2; 

        
        for (int i = 0; i < n; i++) {
            int numerador = fibonacci(i);  

            
            double termino = Math.pow(numerador / (double) denominador, exponente);
            if (i % 2 == 0) {
                resultado += termino; 
            } else {
                resultado -= termino; 
            }

            
            denominador += 2;
            exponente += 2;
        }

        System.out.printf("El resultado de la serie es: %.5f%n", resultado);
        scanner.close();
    }
}

