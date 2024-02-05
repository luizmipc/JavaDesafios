import java.util.Locale;
import java.util.Scanner;

/**
<b>Definição da Classe pública App (principal)</b>
<p>Dependências:</p>
<ul>
    <li>ContaTerminal</li>
</ul>
*/
public class App {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Define o número da conta bancária da conta.</p>
    */
    public static void informeNumero(ContaTerminal conta) {

        System.out.print("Por favor, digite o número da conta bancária! ");
        conta.numero = Integer.parseInt((sc.nextLine()));
        System.out.printf("Número da conta: %d\n", conta.numero);
    }

    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Define o número da agência da conta.</p>
    */
    public static void informeAgencia(ContaTerminal conta) {

        System.out.print("Por favor, digite o número da agência! ");
        conta.agencia = sc.nextLine();
        System.out.printf("Nome da agência: %s\n", conta.agencia);

    }

    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Define o nome do cliente da conta.</p>
    */
    public static void informeNomeCliente(ContaTerminal conta) {

        System.out.print("Por favor, digite o nome do cliente! ");
        conta.nomeCliente = sc.nextLine();
        System.out.printf("Nome do cliente: %s\n", conta.nomeCliente);

    }

    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Define o saldo da conta bancária da conta.</p>
    */
    public static void informeSaldo(ContaTerminal conta) {

        System.out.print("Por favor, digite o saldo! ");
        conta.saldo = Double.parseDouble(sc.nextLine());
        System.out.printf("Saldo: %f\n", conta.saldo);

    }

    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Define os atributos do objeto: contaTerminal.</p>
    */
    public static void cadastrarContaBancaria(ContaTerminal contaTerminal) {
        informeNomeCliente(contaTerminal);
        informeAgencia(contaTerminal);
        informeNumero(contaTerminal);
        informeSaldo(contaTerminal);
    }
    
    /**
    * <b>Método público da classe App sem retorno com parâmetro</b>
    * <p>Exibe o nome do cliente, o número da conta, o número da conta bancária e o valor do saldo.</p>
    */
    public static void exibirInformacoesCliente(ContaTerminal conta){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
        conta.nomeCliente,
        conta.agencia,
        conta.numero,
        conta.saldo
        );
    }
    
    /**
    * <b>Método público da classe App (principal) com parâmetro</b>
    * <p>Exibe o nome do cliente, o número da conta, o número da conta bancária e o valor do saldo.</p>
    */
    public static void main(String[] args) throws Exception {
        ContaTerminal contaBancaria = new ContaTerminal();
        cadastrarContaBancaria(contaBancaria);
        sc.close();
        exibirInformacoesCliente(contaBancaria);
    }
}
