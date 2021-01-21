package ATV_05;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito Realizado!");
        } else{
            System.out.println("Operação não Realizada!");
        }
    }
    
    public void sacar(double valor) {
        if(this.saldo-valor >= 0){
            this.saldo -= valor;
            System.out.println("Saque Realizado!");
        } else{
            System.out.println("Operação não Realizada!");
        }
    }
    
    public void transferir(Conta destino,double valor){
        if(valor > 0){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência Realizada!");
        } else{
            System.out.println("Operação não Realizada!");
        }
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
