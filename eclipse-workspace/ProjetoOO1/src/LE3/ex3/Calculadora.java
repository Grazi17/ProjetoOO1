package LE3.ex3;

/*3. Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo (básica, financeira, científica, etc.) e memória interna (em megabytes), que
devem ser inicializados no momento de sua criação (método construtor). Uma vez iniciado os
atributos, os mesmos não poderão ser alterados, ou seja, não podem possuir os métodos
setters. Além disso, uma calculadora que seja capaz de realizar as quatro operações básicas:
soma, subtração, multiplicação e divisão. Para testá-la, utilize uma classe de teste e, ao
invocar os métodos da calculadora, passe por parâmetro dois valores para realizar os
cálculos.*/

public class Calculadora {
	String marca;
	String modelo;
	String tipo;
	int memoriaInterna;
	boolean ligado;

	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna, boolean ligado) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
		this.ligado = ligado;
		
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("A calculadora ligou");
		} else {
			System.out.println(" A calculadora já está ligada.");
		}
	}

	public void desligar() {
		if (ligado == true) {
			ligado = false;
			System.out.println("A calculadora desligou.");
		} else {
			System.out.println("A calculadora já está desligada.");
		}
	}

	public void somar(double a, double b) {
		if (ligado) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else {
			System.out.println("Calculadora desligada. Ligue-a para realizar operações.");

		}
	}

	public void subtrair(double a, double b) {
		if (ligado) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else {
			System.out.println("Calculadora desligada. Ligue-a para realizar operações.");

		}
	}

	public void multiplicar(double a, double b) {
		if (ligado) {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else {
			System.out.println("Calculadora desligada. Ligue-a para realizar operações.");

		}

	}

	public void dividir(double a, double b) {
		if (ligado) {
			if (b != 0) {
				System.out.println(a + " / " + b + " = " + (a / b));
			} else {
				System.out.println("Erro: divisão por zero.");

			}
		} else {
			System.out.println("Calculadora desligada. Ligue-a para realizar operações.");

		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}

	public boolean isLigado() {
		return ligado;
	}

	
	

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + "]";
	}
}
