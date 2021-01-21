package ATV_05;

public class TesteBanco {
    public static void main(String[] args) {
        
        Conta c1 = new Conta("1",1000);
        Poupanca p2 = new Poupanca(2,"2",1000);
        
        c1.sacar(100);
        p2.sacar(100);
        System.out.println(c1.getSaldo());
        System.out.println(p2.getSaldo());
        c1.transferir(p2,100);
        
        Banco b1 = new Banco(10);
        b1.inserir(c1);
	      b1.inserir(p2);
        System.out.println(b1.consultar("1"));
        System.out.println(b1.consultar("2"));
        b1.transferir("1", "2", 100);
        System.out.println(c1.getSaldo());
        b1.excluir("2");
        
        ContaImposto ci1 = new ContaImposto("3",1000);
        ci1.sacar(100);
	      System.out.println(ci1.getSaldo());
 
    }
}
