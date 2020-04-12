package Main;

public class Carro extends Veiculo{
	protected String placa;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void ligar() {
		System.out.println("Ligado ;)");
	}
	
	public void desligar() {
		System.out.println("Desligado :(");
	}
}
