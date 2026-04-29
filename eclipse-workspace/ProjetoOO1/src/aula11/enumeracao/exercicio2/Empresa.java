package aula11.enumeracao.exercicio2;

public class Empresa {
	private String razaoSocial;
	private int cnpj;
	private UnidadeFederativa unidadeFederativa;
	
	public Empresa(String razaoSocial, int cnpj) {
		
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		
	}
	
public void imprimirDados() {
		
		System.out.println("ID:" + this.razaoSocial);
		System.out.println("Data:" + this.cnpj);
		System.out.println();
		System.out.println("==================");
	
}
}
