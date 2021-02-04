<h2> POO_ATV_08 Questões escritas 1-3, 6</h2>
<br><br><br>	
<h3> 1. Podemos instanciar classes abstratas? Justifique. </h3>

Não é possivel instanciar uma classe abstrata como objeto. Porém, pode-se instaciar
classes que estendem a métodos de uma classe abstrata .

<br><br><br>	
<h3> 2. Explique o que é necessário para que a compilação da ClasseConcreta ocorra
sem erros: </h3>

```
public abstract class ClasseAbstrata {  | public class ClasseConcreta extends ClasseAbstrata {  
public abstract void imprimaAlgo();     |     
}                                       | }
```

2. Neste caso, se faz necessário implementar todas os métodos abstratos contidos na classe abstrata 
para que o código ocorra sem erros ou tornar a classe concreta em abstrata.

<br><br><br>	
<h3> 3. Se uma classe que herda de uma abstrata e não implementa os seus métodos, o
que ocorre? </h3> 

Ocorre um erro no código pois a classe que herda deve obrigatoriamente implementar os métodos da classe
abstrata

<br><br><br>
<h3> 6. Não podemos aplicar o operador new em FiguraGeometrica, mas por que então
podemos dar new em FiguraGeometrica[10], por exemplo? </h3> 

Neste caso ```FiguraGeometrica[10]``` se trata de criar um array de interfaces o que é possível.
