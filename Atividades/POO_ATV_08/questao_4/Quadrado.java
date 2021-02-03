package ATV_08.questao_4;

public class Quadrado extends FiguraGeometrica {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        double valor = this.lado*this.lado;
        return valor;
    }

    @Override
    public double perimetro() {
        double valor = this.lado*4;
        return valor;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
