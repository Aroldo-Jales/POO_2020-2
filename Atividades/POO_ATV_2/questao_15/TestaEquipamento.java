package POO_ATV_02;

public class TestaEquipamento {
	public static void main(String[] args) {
		Equipamento tv = new Equipamento();
		Equipamento ps4 = new Equipamento();
		tv.liga();
		ps4.desligado();
		tv.inverte();
		ps4.inverte();

		if (tv.estaLigado() == true) {
			System.out.println("Televisão Ligada!");
		} else {
			System.out.println("Televisão Desligada!");
		}

		if (ps4.estaLigado() == true) {
			System.out.println("Playstation 4 Ligado!");
		} else {
			System.out.println("Playstation 4 Desligado!");
		}
    	}
}
