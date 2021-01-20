// Questao_08
package POO_ATV_02;
import java.util.Scanner;

public class TestaSaudacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Saudacao ns = new Saudacao();
		
		System.out.print("Mensagem: ");
		ns.texto = scan.nextLine();
		System.out.print("Destinatário: ");
		ns.destinatario = scan.nextLine();
		
		System.out.println(ns.ObterSaudacao());
	}
}
