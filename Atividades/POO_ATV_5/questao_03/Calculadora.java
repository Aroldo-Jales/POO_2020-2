package ATV_05;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double soma() {
        double operacao = this.num1+this.num2;
        System.out.print(num1+" + "+num2+" = ");
        return operacao;
    }
    
    public double subtracao() {
        double operacao = this.num1-this.num2;
        System.out.print(num1+" - "+num2+" = ");
        return operacao;
    }
    
    public double multiplicacao() {
        double operacao = this.num1*this.num2;
        System.out.print(num1+" * "+num2+" = ");
        return operacao;
    }
    
    public double divisao() {
        double operacao = this.num1/this.num2;
        System.out.print(num1+" / "+num2+" = ");
        return operacao;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
