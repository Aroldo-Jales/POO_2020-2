package POO_ATV_02;

public class TestaNumbersUtils.java {
	public static void main(String[] args) {
		NumbersUtils num = new NumbersUtils();
		num.number = 7;
		
		System.out.println("Par: "+num.isPair());
		System.out.println("Ímpar: "+num.isOdd());
		System.out.println("Primo: "+num.isPrime());
		System.out.print("Contagem Crescente: ");
		num.printCount();
		System.out.print("\nContagem Decrescente: ");
		num.printReverseCount();
	}
}
