package ATV_08.questao_7_9;

public class TestaFiguraGeometrica {
    
    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado(5);
        Triangulo t1 = new Triangulo(5,10,5,5);
        Retangulo r1 = new Retangulo(5,10);
        
        System.out.println("Area Quadrado = "+ q1.calcularArea());
        System.out.println("Perimetro Quadrado = "+ q1.perimetro());
        
        System.out.println("Area Triangulo = "+ t1.calcularArea());
        System.out.println("Perimetro Triangulo = "+ t1.perimetro());
        
        System.out.println("Area Retangulo = "+ r1.calcularArea());
        System.out.println("Perimetro Retangulo = "+ r1.perimetro());
        
        System.out.println(r1.comparar(q1));
        System.out.println(q1.comparar(t1));
        System.out.println(q1.comparar(r1));
    }
    
}
