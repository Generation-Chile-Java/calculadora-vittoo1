package TrabajosSolos;

import java.util.Scanner;

public class ComisionApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String confirmar = "si";
        String continuar;

        System.out.println("****************Bienvenido a ComisionApp****************\n");

        do {
            System.out.print("Por favor ingresa tus ventas: $");
            int ventas = teclado.nextInt();
            teclado.nextLine();

            if (ventas > 100000) {
                System.out.println("La comisión por el monto de $" + ventas + " es del 30%");
            } else if (ventas >= 50001 && ventas <= 90999) {
                System.out.println("La comisión por el monto de $" + ventas + " es del 20%");
            } else if (ventas >= 10001 && ventas <= 40999) {
                System.out.println("\nLa comisión por el monto de $" + ventas + " es del 10%");
            } else if (ventas <= 10000 && ventas >= 0) {
                System.out.println("Este monto no genera comisión");
            }
            if (ventas < 0) {
                System.out.println("Error: El monto de ventas no puede ser negativo");
            }

            System.out.print("\n¿Desea realizar otra operación? (si/no): ");
            continuar = teclado.nextLine();

        } while (continuar.equalsIgnoreCase(confirmar));

        System.out.println("Gracias por usar ComisionApp");
    }
}
