package aula12.listas.exemplo1;

public class Pessoa {

	private String nome;
	private int idade;
	private double peso;
	
	public Pessoa(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
	
	
}
