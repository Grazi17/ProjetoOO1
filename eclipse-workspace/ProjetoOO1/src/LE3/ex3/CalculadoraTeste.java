package LE3.ex3;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora("casio","G37", "Cientifica", 200, false);
		
		calc.ligar();
		calc.desligar();
		calc.desligar();
		calc.ligar();
		
		calc.somar(2, 2);
	}
}
