package Main;

public class Veiculo {
	protected String marca, modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("VRUM!.....");
	}
}
