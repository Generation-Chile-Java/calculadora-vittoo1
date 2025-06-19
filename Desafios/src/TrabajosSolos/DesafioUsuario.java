package TrabajosSolos;

import java.util.Scanner;

public class DesafioUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuacion = 'n';
        System.out.println("-----Completa tus datos-----");
        String nombre = null;

        while (continuacion == 'n' || continuacion == 'N') {

            System.out.print("Ingresa tu nombre: ");
            nombre = entrada.next();
            System.out.print("ingresa tu edad: ");
            byte edad = entrada.nextByte();
            System.out.print("Ingresa tu genero: ");
            String genero = entrada.next();
            System.out.print("Preferencia de trabajo: ");
            String trabajo = entrada.next();
            System.out.print("Nacionalidad: ");
            String nacionalidad = entrada.next();
            System.out.println("Tipo de sangre: ");
            System.out.print("1.Tipo A+ ");
            System.out.print("2.Tipo O+ ");
            System.out.print("3.Tipo B+ ");
            System.out.print("4.Tipo AB+ ");
            System.out.print("5.Tipo A- ");
            System.out.print("6.Tipo O- ");
            System.out.print("7.Tipo B- ");
            System.out.println("8.Tipo AB- ");
            byte tipoDeSangre = entrada.nextByte();
            switch (tipoDeSangre) {
                case 1:
                    System.out.println("has seleccionado tipo A+");
                    break;
                case 2:
                    System.out.println("has seleccionado tipo O+");
                    break;
                case 3:
                    System.out.println("has seleccionado tipo B+");
                    break;
                case 4:
                    System.out.println("has seleccionado tipo AB+");
                    break;
                case 5:
                    System.out.println("has seleccionado tipo A-");
                    break;
                case 6:
                    System.out.println("has seleccionado tipo O-");
                    break;
                case 7:
                    System.out.println("has seleccionado tipo B-");
                    break;
                case 8:
                    System.out.println("has seleccionado tipo AB-");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Estan correctos estos datos?");
            System.out.print("Yes/No: " );
            continuacion = entrada.next().charAt(0);
            System.out.println("Completa nuevamente tus datos: ");
        }
        System.out.println("\n¡Bienvenido " + nombre + " te has registrado de forma correcta!\n");






    }
}
