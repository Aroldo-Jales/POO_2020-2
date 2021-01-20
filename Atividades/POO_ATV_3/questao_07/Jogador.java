package Poo.ATV_03;

public class Jogador {
    int forca;
    int nivel;
    int pAtuais;
    int pAtaque;
    
    public Jogador(int forca, int nivel, int pAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pAtuais = pAtuais;
        
    }
    public void Status(){
        System.out.println(this.pAtaque);
    }

    public int pAtaque(){
        return this.pAtaque = this.forca*this.nivel;
    }
    
    public void Atacar(Jogador j2){
        j2.pAtuais = j2.pAtuais - this.pAtaque;
    }
    
    public void placar(Jogador j){
        System.out.println("Jogador 1 pontos = "+this.pAtuais);
        System.out.println("Jogador 2 pontos = "+j.pAtuais);
        if (this.pAtuais > j.pAtuais) {
            System.out.println("O jogador com "+this.pAtuais+" pontos ganhou");
        } else if (this.pAtuais < j.pAtuais) {
            System.out.println("O jogador com "+j.pAtuais+" pontos ganhou");
        } else {
            System.out.println("Empate");
        }
    }
}
