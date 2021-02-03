package ATV_08.questao_4;

public class Retangulo extends FiguraGeometrica {
    
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        double valor = this.altura*this.base;
        return valor;
    }

    @Override
    public double perimetro() {
        double valor = (this.altura+this.base)*2;
        return valor;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    } 
    
}
