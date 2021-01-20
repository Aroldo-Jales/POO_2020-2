package Poo.ATV_03;

import java.util.Objects;

public class Produto {
    String codigo;
    String descricao;
    double valor;
    int quantidade;
    int qtdMin = 3;

    public Produto(String cod, String des, double val, int qtd) {
        this.codigo = cod;
        this.descricao = des;
        this.valor = val;
        this.quantidade = qtd;
    }
    
    public boolean baixar(int qtd){
        if (this.quantidade - qtd < qtdMin){
            System.out.println("Operção não realizada.");
            System.out.println("Produto estará na quantidade mínima.");
            return false;
        } else {
            this.quantidade =  this.quantidade - qtd; 
            return true;
        }
    }
    
    public void reajusta(double taxa){
        this.valor = this.valor + (this.valor*(taxa/100));
    }
    
    public void repor(int qtd){
        this.quantidade =  this.quantidade + qtd;
    }
    
    public void statusProd(){
        System.out.println("");
        System.out.println("Código: "+this.codigo);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Valor: "+this.valor);
        System.out.println("Quantidade: "+this.quantidade);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    } 
}
