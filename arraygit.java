import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Introdueix els numeros:");
            numeros[i] = sc.nextInt();
            i++;

        }
        // numeros = [1, 2, 3, 4, 5, 6]

        int numerosel = sc.nextInt();
        // numerosel = 4

        int j = 0;
        while (j < 6) {
            if (numerosel == numeros[j]) {
                System.out.print("La posicio del numero es:" + (j + 1));
                break;
            }
            j++;
        }

        if (j == 6) {
            System.out.print("No s'ha trobat el numero");
        }

    }

    class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
}
