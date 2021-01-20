// Questao_11
package POO_ATV_02;

public class DecimalNumber {
	double valor;
	
	public int parteInteira() {
		int inteiro = (int) valor;
		return inteiro;
	}
	
	public double parteDecimal() {
		double decimal = valor % 1;
		return decimal;
	}
}
