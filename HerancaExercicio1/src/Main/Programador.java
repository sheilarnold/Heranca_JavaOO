package Main;

import java.util.List;

public class Programador extends Funcionario{
	protected List<String> linguagens;
	protected String preferencia;
	protected String projetoAtual;
	
	public List getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(List linguagens) {
		this.linguagens = linguagens;
	}
	public String getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	public String getProjetoAtual() {
		return projetoAtual;
	}
	public void atribuiProjeto(String projeto) {
		this.projetoAtual = projeto;
	}	
	
	public void adicionaLinguagem(String linguagem) {
		this.linguagens.add(linguagem);
	}
	//computaSalario
}
