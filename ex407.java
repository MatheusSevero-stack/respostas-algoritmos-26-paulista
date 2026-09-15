package respostasAlgoritmos26Paulista;
import java.util.Scanner;
public class ex407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1, mes1, ano1, dia2, mes2, ano2;
        System.out.println("Primeira data: ");
        System.out.print("Digite o dia: ");
        dia1 = sc.nextInt();
        System.out.print("Digite o mês: ");
        mes1 = sc.nextInt();
        System.out.print("Digite o ano: ");
        ano1 = sc.nextInt();

        System.out.println("Segunda data:");
        System.out.print("Digite o dia: ");
        dia2 = sc.nextInt();
        System.out.print("Digite o mês: ");
        mes2 = sc.nextInt();
        System.out.print("Digite o ano: ");
        ano2 = sc.nextInt();
        
        System.out.println("Resultado da comparação das datas:");
        if (ano1 < ano2) {
            System.out.println("A primeira data é mais antiga.");
        } 
        else if (ano2 < ano1) {
            System.out.println("A segunda data é mais antiga.");
        } 
        else { 
            if (mes1 < mes2) {
                System.out.println("A primeira data é mais antiga.");
            } 
            else if (mes2 < mes1) {
                System.out.println("A segunda data é mais antiga.");
            } 
            else { 
                if (dia1 < dia2) {
                    System.out.println("A primeira data é mais antiga.");
                } 
                else if (dia2 < dia1) {
                    System.out.println("A segunda data é mais antiga.");
                } 
                else {
                    System.out.println("As duas datas são exatamente iguais.");
                }
            }
        }
        sc.close();
    }
}