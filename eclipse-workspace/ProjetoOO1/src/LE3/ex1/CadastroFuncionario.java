package LE3.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*1. Uma empresa precisa automatizar o processo de cadastro de seus funcionários. Sabe-se que
um funcionário possui seu número de registro, nome completo, data de nascimento, sexo,
setor em que trabalha, telefone e endereço. O endereço é formado pelo nome da rua, número,
bairro, cidade e estado. Todos os dados devem ser inicializados pelo método construtor e
podem ser obtidos e por meio métodos de acesso (getters). Entretanto, apenas o setor e o
telefone podem ser alterados por meio dos métodos de acesso (setters). Além disso, deve
ser possível emitir um relatório com os dados do funcionário. Utilize uma classe de teste para
instanciar os funcionários, bem como atribuir valores aos seus dados e invocar os métodos
a fim de testá-los.
*/ 

public class CadastroFuncionário {
	
	//atributos de instância
	private int numeroRegistro;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco endereco;
	
	//metodos construtores
	public CadastroFuncionário(int numeroRegistro, String nomeCompleto, LocalDate dataNascimento, String sexo, String setor, String telefone, Endereco endereco) {
		this.numeroRegistro = numeroRegistro;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}
		
		//demais metodos  da classe
		
		public String gerarRelatorio() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formata a data
	        String dataNascimentoFormatada = dataNascimento.format(formatter); // Formata a data
	        return "Número de Registro: " + numeroRegistro + "\n" +
	               "Nome Completo: " + nomeCompleto + "\n" +
	               "Data de Nascimento: " + dataNascimentoFormatada + "\n" +
	               "Sexo: " + sexo + "\n" +
	               "Setor: " + setor + "\n" +
	               "Telefone: " + telefone + "\n" +
	               "Endereço: " + endereco.toString();
		}
		
		 public int getNumeroRegistro() {
		        return numeroRegistro;
		    }

		    public String getNomeCompleto() {
		        return nomeCompleto;
		    }

		    public LocalDate getDataNascimento() {
		        return dataNascimento;
		    }

		    public String getSexo() {
		        return sexo;
		    }

		    public String getSetor() {
		        return setor;
		    }

		    public void setSetor(String setor) {
		        this.setor = setor;
		    }

		    public String getTelefone() {
		        return telefone;
		    }

		    public void setTelefone(String telefone) {
		        this.telefone = telefone;
		    }

		    public Endereco getEndereco() {
		        return endereco;
		    

		
		
	}

	

}

