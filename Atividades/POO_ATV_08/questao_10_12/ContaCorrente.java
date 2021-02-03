package ATV_08.questao_10_12;

public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public double calcularTributos() {
        double valor = getSaldo()*0.10;
        return valor;
    }
    
}
