package aula12.listas.exemplo1;

import java.util.List;
import java.util.ArrayList;

public class Exemplo1 {
	public static void main(String[] args) {


		Pessoa p1 = new Pessoa("Maria",45, 50.8);
		Pessoa p2= new Pessoa("Maria",45, 50.8);
		Pessoa p3 = new Pessoa("Maria",45, 50.8);
		
		List<String> listaPessoa = new ArrayList<>();

		listaPessoas.add("João da Silva");
		listaGenerica.add(p1);
		listaGenerica.add(p2);
		listaGenerica.add(p3);
		
		for(Pessoa pessoa : listaPessoa) {
			
		}
		

		/*for (int i = 0; i < listaGenerica.size(); i++) {
			System.out.println(listaGenerica.get(i));
		}*/
	}
}
