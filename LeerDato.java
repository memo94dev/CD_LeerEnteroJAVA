import java.util.Scanner;

public class LeerDato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt(); // Leer Dato de tipo Entero
        System.out.println("El número ingresado es: " + numero);
        scanner.close(); // Cerrando el scanner
    }
}