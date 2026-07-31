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