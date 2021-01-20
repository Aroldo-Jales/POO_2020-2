package ATV_06;

public class TestaProduto {
    public static void main (String[] args){
        Estoque es = new Estoque();
        Produto p1 = new Produto(001, "Agua", 3, 3);
        Produto p2 = new Produto(002, "Suco", 3, 6);
        Produto p3 = new Produto(003, "Refrigerante", 3, 3);
        es.salvar(p1);
        es.salvar(p2);
        es.salvar(p3);
        es.deletar(p3);
    }    
}   
