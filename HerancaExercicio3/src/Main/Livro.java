package Main;

public class Livro extends Produto{
	protected String autor;
	protected int paginas;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void eGrande(boolean info) {
		if(info) {
			System.out.print(" O livro � grande <3 :)");
		}else {
			System.out.print(" O livro � pequeno :( mas acho que vale a pena <3 :)");
		}
	}
}
