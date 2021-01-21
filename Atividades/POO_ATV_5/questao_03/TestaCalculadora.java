package ATV_05;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10,5);
        System.out.println(calc.soma());
        System.out.println(calc.subtracao());
        System.out.println(calc.multiplicacao());
        System.out.println(calc.divisao());
    }
}
