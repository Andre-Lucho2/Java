## Generics Delimitados (Bounded Types)

**Assinatura de um método exemplo e sua delimitação:**

> ### public static <T extends Comparable<T>> T max(List<T> list)

- a) `public static <T>` --> parametrização do método. Informa ao compilador que
  este método trabalha com um tipo "T" genérico independente

- b) `T max` --> o método devolverá um elemento do mesmo tipo "T" contido na
  lista. O método se chama "max"

- c) `List<T>` --> recebe uma lista contendo objetos do tipo "T"

- d) `<T extends Comparable> `  
  extends == subtipo --> herança ou implementação de `Comparable`; "T" deve ser compatível com o tipo limite (`Comparable<T>`).

### `T Extends Comparable` é o delimitante:

---

"Não aceite qualquer classe em "T"; aceite apenas classes que sejam subtipos ou implementem `Comparable`"

como estou chamando o método "compareTo" (de `Comparable`) em: `if
(item.compareTo(max) > 0)`,
tenho que ter ele implementado na class `Product`(que é meu tipo "T")

## Então:

Estou indicando que o meu tipo generic "T" (ou `Product`) é um
subtipo que herda de `Comparable` seus atributos e métodos;
em outras palavras: O tipo "T" precisa ser qualquer subtipo de `Comparable`
(deve ser um subclasse ou implementar `Comparable`);

d.1) `Comparable<T>` --> É a interface de comparação. Ela contém exatamente o
método

### A assintura final <T extends Comparable<T>> está dizendo ao compilador:

---

"Pode compilar a linha `item.compareTo(max)`, porque eu garanto que qualquer tipo "T" que entrar nessa lista obrigatoriamente implementa `Comparable` e sabe comparar um "T" com outro "T" ".

### Mais completo:

---

`public static <T extends Comparable<? super T>> T max(List<T> list) {}`

`Comparable<? super T>` -->  
"Uma comparação feita para o tipo "T" ou para qualquer superclasse (mãe, avó) de T"

Imaginando que tenhamos implementado a class `Eletronico.java`

```java
public class Eletronico extends Product {
    private String voltage;
    ...
}

em App.java:

List<Eletronico> listaEletronicos = new ArrayList<>();
Eletronico maisCaro = CalculationService.max(listaEletronicos);

```

Quem implementou a interface? Foi Product `Product implements Comparable<Product>`.

A classe Eletronico apenas herdou a comparação que já veio da mãe `Comparable<Product>`:

- `<? super T>` pode ser a própria class `Eletronico`, ou a sua classe mãe `Product` , ou até a classe raiz `Object`.

- Como `Eletronico` herda `Comparable<Product>`, a regra é atendida com perfeição! O código compila e funciona perfeitamente.

- Se não tivesse `<? super T>` apenas a class `Product` tem o metodo herdado ou implementado de `Comparable`
