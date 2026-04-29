package aula11.enumeracao.exercicio1;

public class Cliente {

	private int codigoCliente;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(int codigoCliente, String dataNascimento) {
		
		this.codigoCliente = codigoCliente;
		this.dataNascimento = dataNascimento;
	}
	public void alterarEstadoCivil(EstadoCivil novoEstadoCivil) {
		this.estadoCivil = novoEstadoCivil;
	}
}
