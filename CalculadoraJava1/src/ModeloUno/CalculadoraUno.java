package ModeloUno;

import java.util.Scanner;

public class CalculadoraUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuacion = 's' ;
        System.out.println("Programa calculadora");
        while (continuacion == 's' || continuacion == 'S')
        {

            System.out.println("Ingresa el primer numero");
            double numeroUno = entrada.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double numeroDos = entrada.nextDouble();
            System.out.println("¿Que operacion quieres hacer?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    double suma = numeroUno + numeroDos;
                    System.out.println("el resultado de la suma es: " + suma);
                    break;
                case 2:
                    double resta = numeroUno - numeroDos;
                    System.out.println(" el resultado de la resta: " + resta);
                    break;
                case 3:
                    double multiplicacion = numeroUno * numeroDos;
                    System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    if (numeroDos != 0) {
                        double division = numeroUno / numeroDos;
                        System.out.println("el resultado de la division es: " + division);
                    } else {
                        System.out.println("la division no se puede hacer por cero");
                    }
                    break;
                case 5:
                    double modulo = numeroUno % numeroDos;
                    System.out.println("el resultado del modulo es: " + modulo);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
            System.out.println("¿Quieres hacer otra operacion?");
            System.out.println("si o no");
            continuacion = entrada.next().charAt(0);
        }
        System.out.println("Gracias por usar esta calculadora");



    }
}
