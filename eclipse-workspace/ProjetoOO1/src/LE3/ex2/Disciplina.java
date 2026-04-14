package LE3.ex2;

/*2. O Departamento Acadêmico de Informática deseja automatizar o processo de criação de
disciplinas para os seus cursos. Desenvolva um sistema que seja capaz de criar novas
disciplinas. Em uma conversa com os coordenadores dos cursos foi possível identificar que
uma disciplina é constituída de seu código, nome, modalidade (Presencial ou A Distância),
carga horária (em horas) e conteúdo programático. Todos os dados devem ser inicializados
pelo método construtor e podem ser obtidos por meio dos métodos de acesso. Apenas o
conteúdo programático pode ser alterado após sua iniciação (método set). Cada disciplina
pode exibir um relatório (uma espécie de resumo), ilustrando ao usuário do sistema os valores
de seus dados. Para efetuar a instanciação de cada disciplina, atribuição de valores e
invocação dos métodos, utilize uma classe de teste.*/

public class Disciplina {

	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private String conteudoProgramatico;

	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, String conteudoProgramatico) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudoProgramatico = conteudoProgramatico;
	}
	
	public void criarNovaDisciplina() {

	}

	public void emitirRelatorio() {
		
		System.out.println("==========================");		
		System.out.println("Codigo:" + codigo);	
		System.out.println("Nome da disciplina:" + nome);	
		System.out.println("Modalidade:" + modalidade);	
		System.out.println("Carga horária:" + cargaHoraria);	
		System.out.println("Conteudo programático:" + conteudoProgramatico);	
		System.out.println("==========================");	
		
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public String getConteudoProgramatico() {
		return conteudoProgramatico;
	}

	public void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + ", conteudoProgramatico=" + conteudoProgramatico + "]";
	}

}
