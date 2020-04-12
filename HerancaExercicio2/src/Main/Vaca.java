package Main;

public class Vaca extends Mamifero{
	protected boolean permiteOrdenha;

	public boolean isPermiteOrdenha() {
		return permiteOrdenha;
	}

	public void setPermiteOrdenha(boolean permiteOrdenha) {
		this.permiteOrdenha = permiteOrdenha;
	}
	
	public void ordenhar() {
		if(this.permiteOrdenha) {
			System.out.println("Tomara que ela tenha conseguido produzir muito leite <3");
		}else {
			System.out.println("Acho que hoje teremos que tomar café puro :(");
		}
	}
}
