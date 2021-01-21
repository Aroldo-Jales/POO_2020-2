package ATV_05;

public class ContaImposto extends Conta {
    private double taxa = 0.38/100;

    public ContaImposto(String numero, double saldo) {
        super(numero, saldo);
    }
    
    @Override
    public void sacar(double valor){
        super.sacar(valor);
        super.sacar(valor*getTaxa()); 
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
