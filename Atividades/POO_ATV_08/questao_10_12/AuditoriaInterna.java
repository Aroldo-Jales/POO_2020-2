package ATV_08.questao_10_12;
import java.util.ArrayList;

public class AuditoriaInterna {
    
    private ArrayList<Tributavel> ListTributaveis = new ArrayList<Tributavel>();
    
    public void adcionaTributavel(Tributavel t1){
        ListTributaveis.add(t1);
    }
    
    public double calcularTributos() {
        double total = 0;
        
        for (Tributavel t1: ListTributaveis) {
            total = total + t1.calcularTributos();
        }
        
        return total;
    }
}
