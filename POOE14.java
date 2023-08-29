//Ejercicio 14
//Cristian Plazas
import java.util.Scanner;

public class POOE14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar y leer las ventas y salario del departamento 1
        System.out.print("Ingrese las ventas del departamento 1: ");
        int VD1 = scanner.nextInt();

        //Solicitar y leer las ventas y salario del departamento 2
        System.out.print("Ingrese las ventas del departamento 2: ");
        int VD2 = scanner.nextInt();

        //Solicitar y leer las ventas y salario del departamento 3
        System.out.print("Ingrese las ventas del departamento 3: ");
        int VD3 = scanner.nextInt();

        //Solicitar y leer el salario de los vendedores en cada departamento
        System.out.print("Ingrese el salario de los vendedores en cada departamento: ");
        int SALAR = scanner.nextInt();

        //Calculo de total de ventas en la empresa
        int TOTVEN = VD1 + VD2 + VD3;

        //Calculo del porcentaje equivalente al 33% de ventas totales
        int PORVEN = TOTVEN * 33 / 100;

        //Calculo de salario recibido en cada departamento
        int SALAR_RECIBIDO1 = (VD1 > PORVEN) ? SALAR + SALAR * 20 / 100 : SALAR;
        int SALAR_RECIBIDO2 = (VD2 > PORVEN) ? SALAR + SALAR * 20 / 100 : SALAR;
        int SALAR_RECIBIDO3 = (VD3 > PORVEN) ? SALAR + SALAR * 20 / 100 : SALAR;

        System.out.println("Salario recibido en departamento 1: $" + SALAR_RECIBIDO1);
        System.out.println("Salario recibido en departamento 2: $" + SALAR_RECIBIDO2);
        System.out.println("Salario recibido en departamento 3: $" + SALAR_RECIBIDO3);

        scanner.close();
    }
}