package ATV_08.questao_5;

public class TesteFuncionarios {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente(5000, "g1_login", "g1_senha");
        Diretor d1 = new Diretor(10000, "d1_login", "d1_senha");
        Cliente c1 = new Cliente();
        
        System.out.println(g1.getBonificacao());
        System.out.println(d1.getBonificacao());
        
        /*
        
        SistemaAutenticacao S = new SistemaAutenticacao();
        
        System.out.println(S.autentica(g1, "g1", "g1"));
        System.out.println(S.autentica(g1, "g1_login", "g1_senha"));
        
        System.out.println(S.autentica(d1, "d1", "d1"));
        System.out.println(S.autentica(d1, "d1_login", "d1_senha"));
        
        System.out.println(S.autentica(c1, "c1", "c1"));
        System.out.println(S.autentica(c1, "c1_login", "c1_senha"));
        
        */
    }
}
