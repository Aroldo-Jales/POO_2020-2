package Poo.ATV_03;

public class Conta {
    String codigo;
    double saldo;
    
    public Conta(String codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            System.out.println("Operação não realizada.");
            return false;
        }
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean transferir(Conta c, double valor){
        if (this.sacar(valor)){
            c.depositar(valor);
            return true;
        } else {
            System.out.println("Operação não realizada.");
            return false;
        }
    }
    
    public void Status() {
        System.out.println("Código "+this.codigo);
        System.out.println("Saldo "+this.saldo);
        System.out.println("");
    }
}
