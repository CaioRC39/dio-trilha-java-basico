import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem de conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome.");
        String nome = scanner.next();

        System.out.println("Digite seu primeiro sobrenome.");
        String sobrenome = scanner.next();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Digite o número da agência.");
        int agencia = scanner.nextInt();

        System.out.println("Digita o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " reais já está disponível para saque.");
    }
}
