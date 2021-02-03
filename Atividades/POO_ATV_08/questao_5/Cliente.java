package ATV_08.questao_5;

public class Cliente implements IAutenticavel {

    @Override
    public boolean autentica(String login, String senha) {
        return login.equals("c1_login") && senha.equals("c1_senha");
        
    }
    
    
}
