package Main;

public class Mamifero extends Animal{
	protected int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void correr() {
		System.out.println("Este mamífero pode correr numa velocidade de até " + this.velocidade + "m/s²");
	}
}
