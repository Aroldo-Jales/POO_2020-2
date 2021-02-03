package ATV_08.questao_7_9;

public class Quadrado implements FiguraGeometrica, Comparavel{
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public int comparar(FiguraGeometrica figura) {
        if (this.calcularArea() > figura.calcularArea()){
            return 1;
        } else if (this.calcularArea() == figura.calcularArea()){
            return 0;
        } else {
            return -1;
        }
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
