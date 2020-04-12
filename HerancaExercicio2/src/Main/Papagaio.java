package Main;

import java.util.List;

public class Papagaio extends Animal{
	protected List vocabulario;
	public void vocabulario() {
		System.out.println("Diferente das outras aves, papagaios são capazes de falar e formam 'vocabulários' a partir da interação com humanos...");
	}
	public List<String> getVocabulario() {
		return vocabulario;
	}
	public void setVocabulario(List<String> vocabulario) {
		this.vocabulario = vocabulario;
	}
	
}
