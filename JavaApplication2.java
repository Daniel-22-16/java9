
package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 != numero2) {
            System.out.println(numero1 + " != " + numero2 + "\t! = DIFERENTE");
        }

        if (numero1 < numero2) {
            System.out.println(numero1 + " < " + numero2 + "\t< MENOR");
        }

        if (numero1 <= numero2) {
            System.out.println(numero1 + " <= " + numero2 + "\t< = MENOR O IGUAL");
        }
    }

    
}

