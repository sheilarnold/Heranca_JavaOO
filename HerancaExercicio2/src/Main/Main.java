package Main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BemTeVi bem = new BemTeVi();
		Papagaio pepe = new Papagaio();
		Vaca mimosa = new Vaca();
		Vaca pedrita = new Vaca();
		Cachorro ozzy = new Cachorro();
		
		ArrayList<String> vocabulario = new ArrayList<String>();ArrayList<String> projetos = new ArrayList<String>();
		
		bem.setNome("Benzinho");
		System.out.println("Bem te vi: " + bem.getNome());
		bem.voar(10);
		bem.falar("bemtivii");
		
		pepe.setNome("Pepe");
		vocabulario.add("Oi.");
		vocabulario.add("Tudo bem?");
		vocabulario.add("Eu sou o pepe :)");
		pepe.setVocabulario(vocabulario);
		
		System.out.print("\n\nPapagaio " + pepe.getNome() + "\n");
		vocabulario = (ArrayList<String>) pepe.getVocabulario();
		for(int i = 0; i < vocabulario.size(); i++) {
			pepe.falar(vocabulario.get(i));
		}
		
		mimosa.setNome("Mimosa");
		mimosa.setVelocidade(45);
		mimosa.setPermiteOrdenha(true);
		System.out.print("\n\nVaca: " + mimosa.getNome() + "\n");
		mimosa.correr();
		mimosa.ordenhar();
		mimosa.falar("Muu");
		
		pedrita.setNome("Pedrita");
		pedrita.setVelocidade(55);
		pedrita.setPermiteOrdenha(false);
		System.out.print("\n\nVaca: " + pedrita.getNome() + "\n");
		pedrita.correr();
		pedrita.ordenhar();
		pedrita.falar("MUUUU");
		
		ozzy.setNome("Ozzy");
		ozzy.setVelocidade(15);	
		System.out.print("\n\nCachorro: " + ozzy.getNome() + "\n");
		System.out.print("Como ele está? ");
		ozzy.setTipoLatido(false);
		ozzy.setLateAlto();
		ozzy.setLateBaixo();
		System.out.print("Como ele está? ");
		ozzy.setTipoLatido(true);	
		ozzy.setLateAlto();
		ozzy.setLateBaixo();
		ozzy.falar(ozzy.getNome() + ": Essa humana não me deixa em paz.");
	}

}
