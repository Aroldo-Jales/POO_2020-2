<h2> POO_ATV_02 - Questões escritas: 1, 2, 3, 4, 9</h2>
<br><br><br>	
<h3> 1. Corrija as seguintes afirmações: Considere uma classe chamada Avaliacao. Para compilarmos e executamos a classe devemos executar os seguintes comandos:</h3>

``` javac Avaliacao.java```  // Serve para compilar, gerando um arquivo Avaliacao.class.

``` javac Avaliacao```  // Serve para executar.
<br><br><br>
<h3> 2. Qual o resultado da compilação do código abaixo e justifique sua resposta: </h3>

```
public class Aplicacao {
	public static void main {
		int contador;
    	System.out.println(contador++);
  	}
}
```

O código não funciona deste modo, pois é necessário acresentar os parâmetros no método principal ```(String[] args)```.

Para funcionar contador deve ser inicializado com um valor inteiro. ```int contador = 0;```.

Se o objetivo for incrementar o valor 1 na variável contador para mostra-lá no println é necessário digitar ```++contador```.
<br><br><br>
<h3> 3. Explique detalhadamente o resultado após a execução abaixo do código:</h3>

```
public class Exemplo {
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		if ((a > 11) && (++b <= 100)){
		System.out.println(a*b);
		} else {
		System.out.println(a-b);
		}
	}
}
```

```a = 9``` desse modo, ```a``` não é maior que o valor ```11```. 

Logo, a condicação:  ```if ((a > 11) && (++b <= 100))``` não está completa e a expressão não é verdadeira.

Assim o programa segue para ```else``` onde ocorre ```(a-b)``` que resulta no ```println``` do valor ```9```, pois ```b = 0```.
<br><br><br>
<h3> 4. Explique detalhadamente qual a saída da execução do trecho de código abaixo e justifique: </h3>

``` 
int op = 1;
switch (op) {
	case 1: System.out.println(op);
	case 2: System.out.println(op);
	default:System.out.println(op);
}
```

A função ```switch()``` é uma estrutura condicional que recebe uma variável como parâmetro no qual são estabelecidos possíveis casos, sendo a comparação verdadeira o comando é executado.

Se o objetivo for apresentar o ``` println``` apenas da variável ``` op``` escolhida é necessário colocar um ```break;``` no final de cada ```case:```
``` 
case 1: 
System.out.println(op);
break;
``` 
<br>
<h3> 9. Compare as implementações da questão 6 e com a implementação das questões 7 e 8. Qual é a abordagem mais "estruturada" e qual a versão mais Orientada a Objetos? Qual a mais modularizada e reutilizável? Entretanto, qual a mais burocrática devido ao problema a ser resolvido? </h3>

A abordagem mais estruturada seria a 8, já que ela possui a função principal onde pode utilizar outras sub-rotinas.

A versão mais orientada a objetos é a questâo 8, onde ocorre a criação de um novo objeto de saudação.

A mais modularizada e reutilizável é a questão 7, onde há uma função de retorno que pode ser reutilizada em qualquer outra classe no mesmo pacote.

Sendo a mais burocrática a questão 8, a qual exige uma maior atenção para os atributos de outra classe, além do maior tamanho da questão em relação as demais.

