
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.next();
        System.out.print("Por favor, digite seu saldo: ");
        double saldo = sc.nextDouble();

        
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");





        sc.close();
    }
}
