// Questao_07
package POO_ATV_02;

public class Saudacao {
	String texto;
	String destinatario;
	
public String ObterSaudacao() {
	String espaco = " ";
	String textoconc = texto + espaco + destinatario; 
	return textoconc;

	}
}	
