import java.util.Scanner;

public class ClasificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Determinar si el número es par o impar");
            System.out.println("2. Determinar si es positivo, negativo o cero");
            System.out.println("3. Verificar si es múltiplo de 5");
            System.out.println("4. Verificar si es divisible entre 3 y 4 al mismo tiempo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese un número: ");
                numero = scanner.nextInt();
            } else {
                numero = 0; 
            }

            switch (opcion) {
                case 1:
                    if (numero % 2 == 0) {
                        System.out.println("El número es par.");
                    } else {
                        System.out.println("El número es impar.");
                    }
                    break;
                case 2:
                    if (numero > 0) {
                        System.out.println("El número es positivo.");
                    } else if (numero < 0) {
                        System.out.println("El número es negativo.");
                    } else {
                        System.out.println("El número es cero.");
                    }
                    break;
                case 3:
                    if (numero % 5 == 0) {
                        System.out.println("El número es múltiplo de 5.");
                    } else {
                        System.out.println("El número no es múltiplo de 5.");
                    }
                    break;
                case 4:
                    if (numero % 3 == 0 && numero % 4 == 0) {
                        System.out.println("El número es divisible entre 3 y 4 al mismo tiempo.");
                    } else {
                        System.out.println("El número NO es divisible entre 3 y 4 al mismo tiempo.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}