import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
        //realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo o número %d\n", i);
        }
	}
}