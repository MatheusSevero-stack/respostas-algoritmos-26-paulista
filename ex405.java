package respostasAlgoritmos26Paulista;
import java.util.Scanner;
public class ex405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, aux;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n1 > n3) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        System.out.println("Os números em ordem crescente são: " + n1 + ", " + n2 + ", " + n3);
        sc.close();
    }
}