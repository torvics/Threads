
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner number = new Scanner(System.in);
        System.out.print("¿De cuantos numeros quiere saber el factorial? ");
        int index = number.nextInt();

        int[] datos = new int[index];

        for (int i = 0; i < index; i++) {

            System.out.print("¿De que numero desea saber el factorial? ");
            int numero = number.nextInt();
            datos[i] = numero;

        }

        number.close();

        for( int s: datos) {
            int n = s;
            Thread t = new Thread( new Factorial(n) );
            t.start();
        }
    }
}


