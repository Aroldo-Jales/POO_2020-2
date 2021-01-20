// Questao_11
package POO_ATV_02;

public class TestaDecimalNumber {
	public static void main() {
		DecimalNumber num = new DecimalNumber();
		num.valor = 21.14;
		
		System.out.println("Parte inteira = "+num.parteInteira()+"\nParte decimal = "+ num.parteDecimal());
	}
}
