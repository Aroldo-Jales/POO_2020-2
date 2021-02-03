package ATV_08.questao_10_12;

public class TestaTributaveis {
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente("1",500); 
        ContaCorrente c2 = new ContaCorrente("1",1000);
        
        SeguroDeVida s1 = new SeguroDeVida();
        SeguroDeVida s2 = new SeguroDeVida();
        
        AuditoriaInterna A = new AuditoriaInterna();
        
        A.adcionaTributavel(c1);
        A.adcionaTributavel(c2);
        A.adcionaTributavel(s1);
        A.adcionaTributavel(s2);
        
        System.out.println(A.calcularTributos()); // VALOR ESPERADO 250,00
        
    }
}
