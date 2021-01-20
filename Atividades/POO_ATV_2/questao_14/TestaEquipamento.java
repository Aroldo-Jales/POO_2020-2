package POO_ATV_02;

public class TestaEquipamento {
	public static void main(String[] args) {
        	Equipamento eq = new Equipamento();
        	eq.ligado = true;

		System.out.println(eq.liga());
		System.out.println(eq.desligado());
		System.out.println(eq.inverte());
		System.out.println(eq.estaLigado());
    	}
}
