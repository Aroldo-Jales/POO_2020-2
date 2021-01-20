package Poo.ATV_03;

public class TestaJogador {
    public static void main(String[] args) {
        
        //Definção dos valores para os atributos de cada objeto
        Jogador j1 = new Jogador(5,10,40);
        Jogador j2 = new Jogador(8,9,60);
        
        //Calculo dos pontos de ataque de j1 = 50
        j1.pAtaque();
        
        //j1 ataca j2 = 60 - 50
        j1.Atacar(j2);
        
        //placar de pontos de ambos os objetos j1 tem mais pontos
        j1.placar(j2);   
    }
}
