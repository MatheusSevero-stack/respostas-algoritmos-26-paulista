package respostasAlgoritmos26Paulista;
import java.util.Scanner;
public class ex404 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números inteiros, separados por espaço:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b || a == c || b == c) {
            System.out.println("Os números não podem ser iguais.");
            return;
        }
        if (a > b && a > c) {
            System.out.println("O maior número é: " + a);
        } else if (b > a && b > c) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("O maior número é: " + c);
        }
        sc.close();
    }
}