package ATV_08.questao_10_12;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if(valor <= 0){
            throw new RuntimeException("Valor inválido!");
        } 
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        validarValor(valor);
        this.saldo -= valor;
    }
    
    public void transferir(Conta destino,double valor){
        this.sacar(valor);
        destino.depositar(valor);
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
    
    private void validarValor(double valor){
    if (saldo-valor <= 0){
        throw new RuntimeException("Saldo insuficiente!");
        } 
    }

}
