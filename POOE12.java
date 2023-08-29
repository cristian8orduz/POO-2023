//Ejercicio 12
//Cristian Plazas
import java.util.Scanner;

public class POOE12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar y leer el nombre del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String NOM = scanner.nextLine();  // Nombre del trabajador

        //Solicitar y leer el número de horas trabajadas
        System.out.print("Ingrese el numero de horas trabajadas: ");
        int NHT = scanner.nextInt();

        //Solicitar y leer el valor de la hora normal trabajada
        System.out.print("Ingrese el valor hora normal trabajada: ");
        int VHN = scanner.nextInt();

        int SALARIO;

        if (NHT > 40) {
            //Calcular horas extras trabajadas
            int HET = NHT - 40;
            
            if (HET > 8) {
                //Calcular horas extras que exceden de 8
                int HEE8 = HET - 8;
                
                //Calcular pago por horas extras con horas excedentes de 8
                int pagoHorasExtras = VHN * 2 * 8 + VHN * 3 * HEE8;
                SALARIO = VHN * 40 + pagoHorasExtras;
            } else {
                //Calcular pago por horas extras sin exceder de 8
                int pagoHorasExtras = VHN * 2 * HET;
                SALARIO = VHN * 40 + pagoHorasExtras;
            }
        } else {
            //Calcular salario sin horas extras
            SALARIO = NHT * VHN;
        }

        
        System.out.println("Nombre del trabajador: " + NOM);
        System.out.println("Salario devengado: $" + SALARIO);

        
        scanner.close();
    }
}