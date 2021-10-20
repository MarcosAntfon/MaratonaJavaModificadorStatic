package ModificadorStaticTest;

import ModificadorStaticDominio.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Ferrari Enzo", 320);
		Carro c3 = new Carro("Lamborghini Veneno", 365);
		Carro c4 = new Carro("Dodge Challenger", 280);
		Carro c5 = new Carro("zonda pagani", 370);
	
		Carro.velocidadeLimite = 200;
		
	c1.imprime();
	c2.imprime();
	c3.imprime();
	c4.imprime();
	c5.imprime();
	
	}

}
