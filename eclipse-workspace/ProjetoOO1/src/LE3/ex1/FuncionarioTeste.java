package LE3.ex1;

import java.time.LocalDate;

import LE3.ex1.Endereco;
import LE3.ex1.CadastroFuncionario;
import LE3.ex1.FuncionarioTeste;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// Criando um endereço
		Endereco enderecoFuncionario = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "SP");

		// Criando um funcionário
		CadastroFuncionario funcionario1 = new CadastroFuncionario(12345, "João Silva", LocalDate.of(1990, 5, 10), // Data
																													// de
																													// nascimento
				"Masculino", "TI", "11-98765-4321", enderecoFuncionario);

		// Imprimindo o relatório
		System.out.println(funcionario1.gerarRelatorio());

		// Alterando o setor e o telefone
		funcionario1.setSetor("Recursos Humanos");
		funcionario1.setTelefone("11-91234-5678");

		// Imprimindo o relatório novamente para verificar as alterações
		System.out.println("\nRelatório atualizado:");
		System.out.println(funcionario1.gerarRelatorio());

	}

}
