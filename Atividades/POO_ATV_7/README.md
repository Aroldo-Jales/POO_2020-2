<h2> POO_ATV_05 </h2>
<br><br><br>	
<h3> 7. Após a alteração anterior, o método transferir também está “validado”? Por que? A
solução ficou mais robusta? Justifique. </h3>
Sim uma vez que, o método transferir depende do método consultar que foi alterado para 
<br><br><br>	
<h3> 12. Descreva e justifique o que acontece no método main abaixo: </h3>

```
public class Teste {
  public static void main(String args[]) {
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
    try {
      throw new RuntimeException();
    } catch (RuntimeException e2) {
      System.out.print("A");
    }
      System.out.print("B");
    }
      System.out.print("C");
    }
}
```

O bloco try possui uma RuntimeException o que faz com que o bloco catch lance as exceções com o print seguido de "ABC".
<br><br><br>	
<h3>13. Sobre exceções, responda:
a. Comente os pontos falhos sobre as 3 alternativas de controle de erros
explicadas em sala de aula;
b. Por que o uso de exceções deixa o código mais confiável?
c. Você concorda que muitos “ifs/else” somem quando se usam exceções?
Exemplifique; </h3>

a) A primeira se trata de tratar a exceção tornando o código mais robusto porém depende da capacidade do programador em perceber onde deve ocorrer a utilização dos blocos try catch, a segunda se trata apenas do lançamento de exceção de uma sob uma condição que deve ser atendida não tendo o devido tratamento
b) Em meu entedimento simplifica o código e faz com que o tratamento de erros seja mais aplicável.
c) Sim, desse modo simplificando o entedimento do código.
