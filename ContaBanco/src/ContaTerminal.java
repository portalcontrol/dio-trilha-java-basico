
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite seu nome:");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite seu saldo:");
        double saldo = sc.nextDouble();

        
        System.out.print("Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".);





        sc.close();
    }
}
