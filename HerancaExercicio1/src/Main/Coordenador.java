package Main;

import java.util.List;

public class Coordenador extends Funcionario{
	protected List Projeto;

	public List getProjeto() {
		return Projeto;
	}

	public void setProjeto(List projeto) {
		Projeto = projeto;
	}
	
	public boolean adicionaProjeto() {
		return true;
	}
	
	public boolean removeProjeto() {
		return true;
	}
	
	public void getNumProjeto() {
		
	}
	
	public void adicionaProjeto(String projeto) {
		this.Projeto.add(projeto);
	}
	
	public void removeProjeto(int i) {
		this.Projeto.remove(i);
	}
	//computaSalario
		
}
