package POO_ATV_02;

public class TestaDesconto {
	public static void main(String[] args) {
		Desconto compra = new Desconto();
		
		compra.valorOriginal = 120;
		compra.desconto = 10;
		
		System.out.println(compra.calcula());
	}
}
