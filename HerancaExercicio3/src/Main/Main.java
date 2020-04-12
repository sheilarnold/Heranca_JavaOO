package Main;

public class Main {

	public static void main(String[] args) {
		Livro fantasma = new Livro();
		Cd villa = new Cd();
		Dvd gmf = new Dvd();
		
		fantasma.setNome("O fantasma de Canterville e outras histórias");
		fantasma.setPreco(25.00);
		fantasma.setAutor("Oscar Wilde");
		fantasma.setPaginas(198);
		System.out.print("Titúlo: " + fantasma.getNome() + "\nAutor: " + fantasma.getAutor() + "\nQuantidade de páginas: " + fantasma.getPaginas() + "\nPreço: " + fantasma.getPreco() + "\n");
		fantasma.eCaro(false);
		fantasma.eGrande(false);
		
		villa.setNome("VillaMix");
		villa.setPreco(50.00);
		villa.setArtista("ALOK");
		villa.setFaixas(12);
		System.out.print("\n\nCD: " + villa.getNome() + "\nArtista: " + villa.getArtista() + "\nQuantidade de faixas: " + villa.getFaixas() + "\nPreço: " + villa.getPreco() + "\n");
		villa.eCaro(true);
		
		gmf.setNome("Gustavo Mioto - Ao Vivo em Fortaleza");
		gmf.setArtista("Gustavo Mioto");
		gmf.setDuracao(240);
		gmf.setPreco(50.00);
		System.out.println("\n\nTítulo: " + gmf.getNome() + "\nArtista: " + gmf.getArtista() + "\nDuração: " + gmf.getDuracao() + "\nPreço: " + gmf.getPreco());
		gmf.eCaro(false);
	}
	

}
