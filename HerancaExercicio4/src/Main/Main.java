package Main;

public class Main {
	public static void main(String[] args) {
		Bicicleta b1 = new Bicicleta();
		Carro c1 = new Carro();
		
		b1.setMarca("Stark");
		b1.setModelo("Urbana");
		
		c1.setMarca("Mitsubishi");
		c1.setModelo("ASX");
		c1.setPlaca("ats - 8080");
		
		System.out.println("Bicicleta " + b1.getMarca() + "\nModelo: " + b1.getModelo());
		b1.acelerar();
		
		System.out.println("\nMarca: " + c1.getMarca() + "\nModelo: " + c1.getModelo() + "\nPlaca: " + c1.getPlaca());
		c1.ligar();
		c1.acelerar();
		c1.desligar();
	}
}
