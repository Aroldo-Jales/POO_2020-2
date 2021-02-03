package ATV_08.questao_5;

public class SistemaAutenticacao {
    
    public boolean autentica(IAutenticavel usuario, String login, String senha){
        
        return usuario.autentica(login, senha);
        
    }
}
