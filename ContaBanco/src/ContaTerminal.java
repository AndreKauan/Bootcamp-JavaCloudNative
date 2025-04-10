import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome!");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numConta = sc.nextInt();

        System.out.println("Por favor, digite o Salda da conta!");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
