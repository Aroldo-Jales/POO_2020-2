package ATV_05;

public class Poupanca extends Conta {
    private double taxaDeJuros;

    public Poupanca(double taxaDeJuros, String numero, double saldo) {
        super(numero, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }
    
    public void renderJuros() {
        double juros = this.getSaldo() * this.taxaDeJuros/100;
        depositar(juros);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
