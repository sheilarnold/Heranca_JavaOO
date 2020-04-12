package Main;

public class Animal {
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar(String texto) {
		System.out.print(texto + " ");
	}
}
