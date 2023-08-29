//Ejercicio 17
//Cristian Plazas
import java.util.Scanner;

public class POOE17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer la cantidad de números naturales a sumar
        System.out.print("Ingrese la cantidad de numeros naturales a sumar: ");
        int N = scanner.nextInt();

        int SUMA = 0;

        // Calcular la suma de los primeros N números naturales
        for (int NUM = 1; NUM <= N; NUM++) {
            SUMA += NUM;
        }

        System.out.println("La suma de los primeros " + N + " numeros naturales es: " + SUMA);

        scanner.close();
    }
}