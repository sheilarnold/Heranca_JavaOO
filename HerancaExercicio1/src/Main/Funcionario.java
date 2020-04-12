package Main;

public class Funcionario extends Pessoa{
	protected int tempoDeServico;
	protected double salarioBase;
	protected int matricula;
	
	public int getTempoDeServico() {
		return tempoDeServico;
	}
	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
