package LE3.ex4;

/*4. Um banco deseja automatizar o processo nas contas de seus clientes. Sabendo que uma
conta é formada por um número da agência, número da conta e saldo, e devem ser
inicializados no momento da criação da conta (método construtor). Desenvolva um sistema para realizar as transações de saque, depósito e verificação de saldo em uma determinada
conta. Para realizar um saque é necessário saber o valor que se deseja sacar, ou seja, o
método sacar necessita do parâmetro valor. O saque só pode ocorrer se o valor a ser sacado
não exceder o valor que há de saldo. Em outras palavras, o saldo da conta não poderá ficar
negativo. Para a realização do depósito também é necessário saber o valor a ser depositado.
Logo, este valor deve ser passado por parâmetro para o método. Este valor é então
incrementado ao saldo atual da conta. Por fim, o método de verificação de saldo apresenta
todos os dados da conta. O saldo da conta só poderá ser alterado por meio dos métodos de
saque e depósito. Os demais atributos não poderão ser alterados após sua inicialização. Para
realizar os testes necessário, uma classe de testes deve ser implementada.
*/

public class Banco {
	// atributos de instância

	private int numeroAgencia;
	private int numero;
	private String titular;
	private double saldo;

	// métodos construtores

	public Banco(int numeroAgencia, int numero, String titular) {
		
		this.numeroAgencia = numeroAgencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	// demais métodos da classe
	public void sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");

		this.calcularRendimentos();
	}

	public void imprimirSaldo() {

		System.out.println("================================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("================================");
	}

	private void calcularRendimentos() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	// método toString e métodos getters e setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if (!titular.equals(""))
			;
		this.titular = titular;

	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}
