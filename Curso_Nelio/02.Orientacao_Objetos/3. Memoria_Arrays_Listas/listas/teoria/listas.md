# Listas
### Referência Oracle: [Listas](https://docs.oracle.com/javase/10/docs/api/java/util/List.html)
---


#### Lista é uma estrutura de dados:
- Homogênea (dados do mesmo tipo)
- Ordenada (elementos acessados por meio de posições)
- Inicia vazia, e seus elementos são alocados sob demanda
- Cada elemento ocupa um "nó" (ou nodo) da lista

### Tipo (interface): List
**Obs.: NÃO aceita tipos primitivos - usar wrappers*
- Classes que implementam: ArrayList, LinkedList, etc.

### Vantagens:
---
- Tamanho variável
-  Facilidade para se realizar inserções e deleções

### Desvantagens:
---
- Acesso sequencial aos elementos*.  *(Pode ser otimizada)

<br>

## Métodos com Listas:
- Tamanho da lista: **size()**
- Obter o elemento de uma posição: **get(position)**
-  Inserir elemento na lista: **add(obj), add(int, obj)**
- Remover elementos da lista: **remove(obj), remove(int), removeIf(Predicate)**
- Encontrar posição de elemento: **indexOf(obj), lastIndexOf(obj)**
- Filtrar lista com base em predicado:
List<Integer> result = **list.stream().filter(x -> x > 4).collect(Collectors.toList());**
- Encontrar primeira ocorrência com base em predicado:
Integer result = **list.stream().filter(x -> x > 4).findFirst().orElse(null);**

<br>

## Obs.: Iniclização(instanciação) de uma lista
Cuidar o modo de inicialização de uma lista:  
Boa prática --> sempre iniciá-la nos **atributos da classe**

```java
public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private List<HourContrat> contrats = new ArrayList<>(); // aqui!

    public Worker(){}

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

```

Isso evita:
---
- **NullPointerException**: Isso garante o princípio defensivo -- uma coleção em um objeto de domínio nunca deve ser null, no máximo deve estar vazia.
- **'Bad smell'**: Em associações tipo "1 para N" (um trabalhador -- vários contratos - exemplo acima), um trabalhador geralmente nasce no sistema **SEM contratos**, e os contratos vão sendo adicionados um a um ao longo do tempo; se eu inicializo uma lista ao instanciar o objeto, estou antencipando que ele terá, obrigatoriamente, +1 contrato, quando ele poderá NÃO ter nenhum em algum momento!!.
