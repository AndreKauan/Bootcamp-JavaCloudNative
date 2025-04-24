import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        ContaBancaria conta = new ContaBancaria(1000);
        System.out.println(conta.consultarSaldo());
        conta.depositar(300);
        System.out.println(conta.consultarSaldo());
        System.out.println(conta.consultarChequeEspecial());



        sc.close();
    }
}
