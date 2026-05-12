package aula12.listas.exemplo2;

public class BancoTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco (125689,"GGHBank");
		
		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "José Carvalho");

		banco1.realizarDepositoConta(222, 100.00);
		banco1.realizarSaqueConta(222, 20.00);

		banco1.verificarSaldoConta(222);
		
	}
}
