package Main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Coordenador c1 = new Coordenador();
		Programador p1 = new Programador();
		
		ArrayList<String> projetos = new ArrayList<String>();
		ArrayList<String> linguagens = new ArrayList<String>();
		
		c1.setNome("Astrid Neumman");
		c1.setCpf("012345678-90");
		c1.setMatricula(1234567);
		c1.setTempoDeServico(15);
		c1.setSalarioBase(25000);
		
		projetos.add("Marvel X DC");
		projetos.add("Jarvis");
		projetos.add("Mineração de bitcoins");
		c1.setProjeto(projetos);
		c1.adicionaProjeto("Bibliotecas X Frameworks");
		c1.adicionaProjeto("Marília ou Gustavo?");
		c1.removeProjeto(3);
		
		p1.setNome("Sheila C.S Arnold");
		p1.setCpf("123456789-01");
		p1.setTempoDeServico(18);
		p1.setSalarioBase(2000);
		p1.setMatricula(0123456);
		
		linguagens.add("Python");
		linguagens.add("Java");
		linguagens.add("PHP");
		p1.setLinguagens(linguagens);
		p1.adicionaLinguagem("JavaScript");
		p1.adicionaLinguagem("HTML");
		
		//p1.setPreferencia(linguagens.get(0));
		p1.setPreferencia((String) p1.getLinguagens().get(1));
		//p1.setProjetoAtual(projetos.get(1));
		p1.atribuiProjeto((String) c1.getProjeto().get(1));
		
		
		System.out.print("\nProfissao: Programador\n   Matricula: " + p1.getMatricula() + "\n   Nome: " + p1.getNome() + "\n   CPF: " + p1.getCpf() + "\n   Tempo de serviço: " + p1.getTempoDeServico() + " meses\n   Salario base: " + p1.getSalarioBase());
		
		linguagens = (ArrayList<String>) p1.getLinguagens();
		for(int i = 0; i < linguagens.size(); i++) {
			if(i == 0) {
				System.out.print("\n   Linguagens: " + i + " - " + linguagens.get(i));
			}else {
				System.out.print("\n               " + i + " - " + linguagens.get(i));
			}
		}
		System.out.print("\n   Preferência: " + p1.getPreferencia() + "\n   Projeto atual: " + p1.getProjetoAtual());
		
		System.out.print("\n\n   Coordenador: " + c1.getNome() + "\n   Matricula: " + c1.getMatricula() + "\n   CPF: " + c1.getCpf() + "\n   Tempo de serviço: " + c1.getTempoDeServico() + " meses\n   Salario base: " + c1.getSalarioBase());
		projetos = (ArrayList<String>) c1.getProjeto();
		for(int i = 0; i < projetos.size(); i++) {
			if(i == 0) {
				System.out.print("\n   Projetos: " + i + " - " + projetos.get(i));
			}else {
				System.out.print("\n             " + i + " - " + projetos.get(i));
			}
		}
	}
}
