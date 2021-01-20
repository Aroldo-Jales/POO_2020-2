package POO_ATV_02;

public class Equipamento {
	boolean ligado;
	
	public boolean liga() {
		ligado = true;
		return ligado;
	}
	
	public boolean desliga() {
		ligado = false;
		return ligado;
	}
	
	public boolean inverte() {
		if(ligado == true) {
			ligado = false;
			return ligado;
		} else {
			ligado = true;
			return ligado;
		}
	}
	
	public boolean estaLigado() {
		return ligado;
	}
}
