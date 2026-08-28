## Bloco Finally - Importância

Sim, **haveria implicações técnicas diretas no comportamento e na segurança da aplicação**, indo além de uma mera questão de estilo ou boa prática.

Ao analisar o código em (9.Files/teoria/src/application/App.java#L23-L30), as principais implicações de executar com ou sem o bloco `finally` são:

---

### 1. Exceções Não Capturadas (`RuntimeException` / `Error`)
* **Sem `finally` (linhas 28–30):** O `catch` atual só captura exceções do tipo `IOException`. Se ocorrer qualquer outra exceção não tratada dentro do bloco `try` (por exemplo, `NullPointerException`, `SecurityException`, `OutOfMemoryError` ou `NoSuchElementException`), o controle do programa pula a linha 28 completamente. O resultado é um **vazamento de recurso** (*resource leak*), pois o ponteiro/stream do arquivo aberto no sistema operacional não é liberado.
* **Com `finally` (linhas 23–27):** O Java **garante** que o bloco `finally` será executado após a saída do `try/catch`, **independentemente de ter ocorrido um erro tratado, um erro não tratado ou nenhum erro**. O arquivo será fechado com segurança antes que a exceção suba na pilha de execução.

---

### 2. Desvios de Fluxo (instruções `return`, `break` ou `continue`)
* **Sem `finally`:** Se no futuro você adicionar um `return` dentro do `try` ou do `catch` (por exemplo, para encerrar um método antecipadamente ao ler algo específico ou ao tratar um erro), o método encerrará imediatamente e as linhas 28–30 **nunca serão atingidas**.
* **Com `finally`:** Mesmo se houver um `return` dentro do `try` ou do `catch`, a máquina virtual Java (JVM) garante a execução do bloco `finally` **antes** de efetivamente retornar da função.

---

### Resumo Comparativo

| Cenário | Com `finally` | Sem `finally` (código atual) |
| :--- | :--- | :--- |
| **Execução Normal** | Fechará o `Scanner` | Fechará o `Scanner` |
| **Exceção `IOException` (capturada)** | Fechará o `Scanner` | Fechará o `Scanner` |
| **Exceção Não Capturada (ex: `RuntimeException`)** | Fechará o `Scanner` | **Não fechará** (causa vazamento de recurso) |
| **Presença de `return` dentro do `try` ou `catch`** | Fechará o `Scanner` | **Não fechará** |

---

### Dica Adicional: *Try-with-resources* (Java 7+)
A partir do Java 7, a forma recomendada e moderna para lidar com recursos que implementam `AutoCloseable` (como `Scanner`, `FileReader`, `BufferedReader`) é o **try-with-resources**, que substitui a necessidade do bloco `finally` manual:

```java
try (Scanner sc = new Scanner(file)) {
    while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
// O Scanner é fechado automaticamente aqui, mesmo em caso de erro!
```