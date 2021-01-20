package Poo.ATV_03;

public class TestaProduto {
    public static void main(String[] args) {
        
        //Definção dos valores para os atributos de cada objeto
        Produto p1 = new Produto("01","Agua",4,10);
        Produto p2 = new Produto("01","Suco",7,10);
        Produto p3 = new Produto("02","Bolo",5,20);
        
        //Operação não realizada pois a qtd do produto estará < que qtd mínina
        p1.baixar(9);
        
        //Reduz 3 da quantidade do protudo = 7
        p1.baixar(3);
        p1.statusProd();
        
        //Acrescenta 5 na quantidade do produto = 15
        p2.repor(5);
        p2.statusProd();
        
        //Reajuste do valor de p1 em 25%
        p1.reajusta(25);
        System.out.println(p1.valor);
        
        //O código de p1 é igual ao código de p2
        System.out.println(p1.equals(p2));
        
        //O código de p1 não é igual ao código de p3
        System.out.println(p1.equals(p3));
    }
}
