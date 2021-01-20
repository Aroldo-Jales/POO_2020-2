<h2> POO_ATV_03 - Questões escritas: 1,2,3,4,5,6</h2>
<br><br><br>	
<h3>  1. Suponha uma classe Hotel que sirva apenas para guardar a quantidade de solicitações de reservas feitas conforme a classe abaixo:</h3>

```
public class Hotel {
  int quantReservas;
  void adicionarReserva() {
    quantReservas++;
  }
}
```

<h3> Podemos afirmar que haverá um problema de compilação, pois a variável inteira não
foi inicializada previamente? Justifique. </h3>

Caso a variável não receba um valor pelo usuário, ela assume um valor padrão sendo ```int = 0```.

<br><br><br>
<h3> 2. Ainda sobre a classe do exemplo anterior, considere o método main abaixo: </h3>

```
public static void main(String args[]) {
  Hotel hotel = new Hotel(2);
  System.out.print(hotel.quantReservas);
}
```

<h3> Qual o resultado da compilação e/ou execução da classe que tenha o método acima?
Justifique. </h3>

Nesse caso, ocorre um erro na compilação, pois para que ```new Hotel(2)``` funcione é necessário um construtor na classe Hotel, para que assim a classe possa receber um parâmetro.

<br><br><br>
<h3> 3. Qual o resultado da execução abaixo. Justifique. </h3>

```
public class Teste {
    int b = 1;
    int a;
  
  Teste(int a) {
    a = b + a;
    System.out.print(this.a);
  }
  
  public static void main(String args[]) {
    Teste t = new Teste(2);
  }
}
```
O resulta é ```0``` pois é utilizado o ```this.a```, como o valor de a não definido previamente seu valor é zero.
Para o código funcionar como esperado o ```this.a``` deve ser colocado também na equação ou também podendo ser retirado do print.

```
Teste(int a) {                      |     Teste(int a) {             
  this.a = b + a;                   |       a = b + a;  
  System.out.print(this.a);         |       System.out.print(a)
}                                   |     }
```

<br><br><br>
<h3> 4. Dado o seguinte trecho de código de acumulação de um atributo valor, explique a
problemática envolvida e reescreva o método com uma solução: </h3>

```
 void x(double valor) {
  valor = valor + valor;
 }                                 
```
Caso queira atribuir o valor de parâmetro somado a ele mesmo ao valor da classe é necessário escrever: ```this.valor = valor + valor;```

<br><br><br>
<h3> 5. Considere as classes Radio e TestaRadio abaixo: </h3>

```
public class Radio {
  int volume;
  Radio(int volume) {
    this.volume = volume;
  }
}

public class TestaRadio {
  public static void main(String[] args) {
    Radio r = new Radio();
    r.volume = 10;
  }
}
```

<h3> Justifique o erro de compilação na classe TestaRadio e proponha uma solução. </h3>

O construtor de Radio não recebe nenhum parâmetro inicial.

O código pode ser compilado da seguinte maneira:

```
public class TestaRadio {
  public static void main(String[] args) {
    Radio r = new Radio(5);
    r.volume = 10;
  }
}
```
A o atributo volume receberá inicialmente o valor ```5``` 

Porém, o valor será modificado em ```r.volume = 10;```

<br><br><br>
<h3> 6. Considerando o uso da classe Conta abaixo em uma classe com o método main(): </h3>

```
public static void main(String[] args) {
  Conta c1 = new Conta("1",100);
  Conta c2 = new Conta("2",100);
  c1 = c2;
  c1.sacar(10);
  c1.tranferir(c2,50);
  
  System.out.println(c1.saldo);
  System.out.println(c2.saldo);
}
```
<h3> a. Qual o resultado dos dois "prints"? Justifique sua resposta. </h3>

Ambos possuem o valor de 90.

<h3> b. O que acontece com o objeto para o qual a referência c1 aponta? </h3>

Ao escrever no código ```c1 = c2``` c1 e c2 passam a corresponder ao mesmo endereço de memória.

