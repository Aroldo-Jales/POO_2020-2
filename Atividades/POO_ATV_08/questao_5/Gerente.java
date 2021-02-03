package ATV_08.questao_5;

public class Gerente extends Funcionario implements IAutenticavel{
    
    private double salario;
    private String login;
    private String senha;
    
    public Gerente(double salario, String login, String senha) {
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    Gerente(int i, String g1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getBonificacao() {
        return (this.salario*0.7)+1000;
    }

    @Override
    public boolean autentica(String login, String senha) {
        if(login.equals(this.login) && senha.equals(this.senha)){
            return true;
        } else {
            return false;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
