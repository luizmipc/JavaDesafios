import java.util.Locale;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);    
    public static void informeNumero(ContaTerminal conta) {

        System.out.print("Por favor, digite o número da conta bancária! ");
        conta.numero = Integer.parseInt((sc.nextLine()));
        System.out.printf("Número da conta: %d\n", conta.numero);
    }

    public static void informeAgencia(ContaTerminal conta) {

        System.out.print("Por favor, digite o número da agência! ");
        conta.agencia = sc.nextLine();
        System.out.printf("Nome da agência: %s\n", conta.agencia);

    }

    public static void informeNomeCliente(ContaTerminal conta) {

        System.out.print("Por favor, digite o nome do cliente! ");
        conta.nomeCliente = sc.nextLine();
        System.out.printf("Nome do cliente: %s\n", conta.nomeCliente);

    }

    public static void informeSaldo(ContaTerminal conta) {

        System.out.print("Por favor, digite o saldo! ");
        conta.saldo = Double.parseDouble(sc.nextLine());
        System.out.printf("Saldo: %f\n", conta.saldo);

    }

    public static void cadastrarContaBancaria(ContaTerminal contaTerminal) {
        informeNomeCliente(contaTerminal);
        informeAgencia(contaTerminal);
        informeNumero(contaTerminal);
        informeSaldo(contaTerminal);
    }
    
    public static void exibirInformacoesCliente(ContaTerminal conta){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
        conta.nomeCliente,
        conta.agencia,
        conta.numero,
        conta.saldo
        );
    }

    public static void main(String[] args) throws Exception {
        ContaTerminal contaBancaria = new ContaTerminal();
        cadastrarContaBancaria(contaBancaria);
        sc.close();
        exibirInformacoesCliente(contaBancaria);
    }
}
