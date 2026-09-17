## Modelo Classe Abstrata + interface

Em Java, quando uma classe abstrata implementa uma interface e opta por não fornecer o corpo para seus métodos, esses métodos passam a ser considerados métodos abstratos herdados daquela classe abstrata.

Essa mecânica teórica e arquitetural opera da seguinte forma:

- **Obrigação postergada:** Uma classe concreta que implementa uma interface é obrigada pelo compilador a fornecer código (`body`) para todos os métodos do contrato. Contudo, por ser `abstract`, a classe `AbstractShape` tem a prerrogativa de **postergar** essa implementação para as suas subclasses concretas (`Rectangle` e `Circle`).

- **Declaração explícita vs. implícita:** Em Java, você não precisa reescrever `public abstract Double area();` dentro do arquivo `AbstractShape.java`. A simples presença da assinatura na interface `Shape` somada ao `implements Shape` faz com que o método `area()` passe a existir implicitamente como um método abstrato dentro de `AbstractShape`.

- **Papel da classe abstrata intermediária:** Do ponto de vista de arquitetura de software, esse padrão divide responsabilidades:
- **A interface (`Shape`):** Define o contrato de comportamento público (`area()`).
- **A classe abstrata (`AbstractShape`):** Compartilha estado e regras comuns às formas (como o atributo `color: Color` e eventuais getters/setters), funcionando como modelo base.

- **As classes concretas (`Rectangle`, `Circle`):** Fornecem a fórmula matemática e o comportamento específico de cada figura geométrica.
