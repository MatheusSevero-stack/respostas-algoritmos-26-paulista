package respostasAlgoritmos26Paulista;
import java.util.Scanner;
public class ex406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        boolean senhaValida = false; 
        System.out.println("Vamos criar a sua senha. Ela deve conter pelo menos 8 caracteres, incluindo pelo menos uma letra maiúscula e um número.");
        while (!senhaValida) {
            boolean temMaiuscula = false;
            boolean temNumero = false;
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
            if (senha.length() < 8) {
                System.out.println("A senha precisa ter pelo menos 8 caracteres.");
            }
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                }
                if (Character.isDigit(c)) {
                    temNumero = true;
                }
            }
            if (!temMaiuscula) {
                System.out.println("A senha precisa conter pelo menos uma letra maiúscula.");
            }
            if (!temNumero) {
                System.out.println("A senha precisa conter pelo menos um número.");
            }
            if (temMaiuscula && temNumero && senha.length() >= 8) {
                System.out.println("Senha criada com sucesso!");
                senhaValida = true;
            } else {
                System.out.println("--- Tente novamente ---\n");
            }
        }
        sc.close();
    }
}