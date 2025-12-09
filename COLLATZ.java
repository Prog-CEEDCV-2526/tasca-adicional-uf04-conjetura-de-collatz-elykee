import java.util.Scanner;

public class COLLATZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Validar número positivo
        do {
            System.out.print("\nIntroduce un número positivo: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num <= 0) {
                System.out.println("\nNúmero no válido, Debe ser mayor que cero.");
            }
        } while (num <= 0);

        mostrarSecuencia(num);

        // El "for" opcional, elegimos un rango del 1 al 10
        for (int number = 1; number <= 10; number++) {
            mostrarSecuencia(number);
        }
        sc.close();
    }

    // Función Collatz
    public static int collatz(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n * 3 + 1;
        }
    }

    // Función para mostrar Secuencia
    public static void mostrarSecuencia(int n) {
        int count = 0;
        System.out.printf("Secuencia de Collatz para el número %d:\n", n);

        // Generar secuencia
        while (n != 1) {
            System.out.print(n + " -> ");
            n = collatz(n);
            count++;
        }
        System.out.println("1");

        System.out.println("Número total de pasos: " + count);
        System.out.println();
    }

}
