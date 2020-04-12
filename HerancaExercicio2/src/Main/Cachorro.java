package Main;

public class Cachorro extends Mamifero{
	protected boolean tipoLatido;

	public boolean isTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}
	
	public void setLateAlto() {
		if(this.tipoLatido) {
			System.out.println("O totó tá bravo.");
		}
	}
	
	public void setLateBaixo() {
		if(!this.tipoLatido) {
			System.out.println("O totó tá tranquilinho hoje.");
		}
	}
}
