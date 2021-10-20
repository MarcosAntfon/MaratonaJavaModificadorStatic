package ModificadorStaticDominio;

public class Carro {

	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 250;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeLimite = velocidadeLimite;
	}


	public void imprime() {
		System.out.println("---------------");
		System.out.println("nome  "+this.nome);
		System.out.println("velocidadeMaxima  "+this.velocidadeMaxima);
		System.out.println("velocidadeLimite  "+Carro.velocidadeLimite);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
}
