import java.util.Scanner;

public class cosesdeclase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        int entrada = scan.nextInt();
        System.out.println("Tria un numero: ");

        while (i < 6) {
            System.out.println("Tria un numero: ");

            int llegir = scan.nextInt();

            if (entrada == llegir) {
                System.out.println("Hem trobat el numero a la posicio: " + i);
                break;
            }

            i++;
        }
        if (i == 6) {
            System.out.println("El numero no esta");
        }
    }

}
