package ATV_06;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> listaProdutos = new ArrayList<Produto>();
        
    public void salvar(Produto produto){
        listaProdutos.add(produto);
    }
    public void deletar(Produto produto){
        listaProdutos.remove(produto);
    }
}
