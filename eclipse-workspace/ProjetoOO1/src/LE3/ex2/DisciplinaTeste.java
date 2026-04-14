package LE3.ex2;

public class DisciplinaTeste {

	public static void main(String[] args) {
		
		Disciplina disc1 = new Disciplina (4545,"OO1" ,"presencial", 60, "Programação Orientada a Objetos");
		Disciplina disc2 = new Disciplina (2542,"OO1" ,"online", 45, "Programação Orientada a Objetos");

		
		disc1.emitirRelatorio();
		disc2.emitirRelatorio();
		
	}

}
