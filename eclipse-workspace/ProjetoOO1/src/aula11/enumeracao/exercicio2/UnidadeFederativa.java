package aula11.enumeracao.exercicio2;

public enum UnidadeFederativa {

	SP("São Paulo", "SP", "São Paulo" ),
	MG("Minas Gerais", "MG", "Belo Horizonte"),
	RJ("Rio de Janeiro", "RJ", ""),
	ES("Espírito Santo", "ES", "Vitória"),
	SC("Santa Catarina","SC", " Florianópolis"),
	PR("Prananá","PR", "Curitiba"),
	RS("Rio Grande do Sul","RS", "Porto Alegre");
	
	private String nomeUF;
	private String sigla;
	private String capital;
	
	private UnidadeFederativa(String nomeUF, String sigla, String capital) {
		this.nomeUF = nomeUF;
		this.sigla = sigla;
		this.capital = capital;
	}

}
