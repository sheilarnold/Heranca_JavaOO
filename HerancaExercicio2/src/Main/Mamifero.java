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
		System.out.println("Este mam�fero pode correr numa velocidade de at� " + this.velocidade + "m/s�");
	}
}
