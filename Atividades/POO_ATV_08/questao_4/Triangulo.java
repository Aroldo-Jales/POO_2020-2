package ATV_08.questao_4;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(float base, float altura, float lado1, float lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularArea() {
        double valor = (this.base*this.altura)/2;
        return valor;
    }

    @Override
    public double perimetro() {
        double valor = this.base+this.lado1+this.lado2;
        return valor;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

}
