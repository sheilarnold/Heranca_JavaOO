package Main;

import java.util.List;

public class Papagaio extends Animal{
	protected List vocabulario;
	public void vocabulario() {
		System.out.println("Diferente das outras aves, papagaios s�o capazes de falar e formam 'vocabul�rios' a partir da intera��o com humanos...");
	}
	public List<String> getVocabulario() {
		return vocabulario;
	}
	public void setVocabulario(List<String> vocabulario) {
		this.vocabulario = vocabulario;
	}
	
}
