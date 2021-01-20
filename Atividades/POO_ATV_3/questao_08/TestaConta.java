package Poo.ATV_03;

public class TestaConta {
    public static void main(String[] args) {
        
        //Definção dos valores para os atributos de cada objeto
        Conta c1 = new Conta("1",100);
        Conta c2 = new Conta("2",100);
        
        //O saldo de c1 deve ficar em 90
        c1.sacar(10);
        
        //O saldo de c2 deve ficar em 190
        c1.transferir(c2,90);
        
        c1.Status();
        c2.Status();
    } 
}
