package respostasAlgoritmos26Paulista;
import java.util.Scanner;
public class ex403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.print("Digite o ano que deseja verificar: ");
        ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é BISSEXTO.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }
        sc.close();
    }
}