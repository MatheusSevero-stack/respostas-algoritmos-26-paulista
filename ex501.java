package respostasAlgoritmos26Paulista;
import java.util.Scanner;

public class ex501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "sim";
        double total = 0, valor;
        int quantidade = 0;
        
        while (resp.equals("sim")) {
            System.out.println("Digite o valor do produto: ");
            System.out.println("Digite -1 para encerrar a compra caso entrou no registro de produtos sem possuir um produto válido.");
            valor = sc.nextDouble();
            sc.nextLine();
            if (valor == -1) {
                break;
            }
            if (valor <= 0) {
                System.out.println("Valor inválido! Por favor, digite um valor maior do que 0.");
                continue; 
            }
            total = total + valor;
            quantidade = quantidade + 1;
            System.out.println("O valor atual é de R$ " + total);
            System.out.println("A quantidade é de: " + quantidade);
            
            while (true) {
                System.out.println("Deseja continuar? (sim/não): ");
                resp = sc.nextLine().toLowerCase().trim();
                if (resp.equals("sim") || resp.equals("não") || resp.equals("nao")) {
                    break; 
                }
                System.out.println("Resposta inválida! Por favor, digite apenas 'sim' ou 'não'.");
            }
        }
        
        System.out.println("O valor total é de R$ " + total);
        System.out.println("A quantidade comprada é de: " + quantidade);
        sc.close();
    }
}