//EJercicio 4
//Cristian Plazas
import java.util.Scanner;

public class POOE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la edad de Juan
        System.out.print("Edad de Juan: ");
        int EdadJuan = scanner.nextInt();

        // Calcular las edades de Alberto, Ana y la mama
        int EdadAlberto = (2 * EdadJuan) / 3;
        int EdadAna = (4 * EdadJuan) / 3;
        int EdadMama = EdadJuan + EdadAlberto + EdadAna;

        // Imprimir las edades
        System.out.println("Edad de Alberto: " + EdadAlberto);
        System.out.println("Edad de Juan: " + EdadJuan);
        System.out.println("Edad de Ana: " + EdadAna);
        System.out.println("Edad de la mama: " + EdadMama);
            }
}





