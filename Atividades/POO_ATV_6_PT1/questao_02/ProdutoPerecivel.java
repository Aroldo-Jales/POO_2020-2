package ATV_06;

public class ProdutoPerecivel extends Produto {
    private int dataValidade;

    public ProdutoPerecivel(int dataValidade, int id, String descricao, int quantidade, float valor) {
        super(id, descricao, quantidade, valor);
        this.dataValidade = dataValidade;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    @Override
    public void darBaixa(int qtd) {
        super.darBaixa(qtd);
    }

    @Override
    public void repor(int qtd) {
        super.repor(qtd); 
    }

    public boolean validade (int dataAtual){
        if ( this.dataValidade < dataAtual){
            return true;
        } else {
            return false;
        }
    }
}
