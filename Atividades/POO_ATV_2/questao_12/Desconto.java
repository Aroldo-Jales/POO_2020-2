package POO_ATV_02;

public class Desconto {
	double valorOriginal;
	double desconto;
	
	public double calcula() {
		double valorCalculado = valorOriginal*(1-desconto/100);
		return valorCalculado;
	}
}
