package Main;

public class Produto {
	protected String nome;
	protected double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void eCaro(boolean info) {
		if(info) {
			System.out.print(" O produto é caro :(");
		}else {
			System.out.print(" O produto não é caro :) <3");
		}
	}
}
