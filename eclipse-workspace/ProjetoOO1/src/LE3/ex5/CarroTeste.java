package LE3.ex5;

public class CarroTeste {

	 public static void main(String[] args) {
		
		 Carro  car1 = new Carro("Ferrari");
		 
		 System.out.println(car1);
		 
		 car1.acelerar();
		 
		 for (int i = 0; i < 5; i++) {

				car1.acelerar();
				System.out.println(car1);
			}

			for (int i = 0; i < 5; i++) {

				car1.frear();
				System.out.println(car1);
			}
	}
	 
}
