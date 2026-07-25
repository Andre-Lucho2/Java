## Casting restrito

Os conceitos de **upcasting** e **downcasting** em Java são aplicados estritamente a referências de **objetos** (classes que têm relação de herança). 

No trecho de código selecionado em (Main.java#L28-L38), os castings ocorrem entre **tipos primitivos** (`int` e `double`). Para tipos primitivos, a terminologia correta é:

### 1. Casting de Alargamento (*Widening Casting*)
Ocorre na linha 31: `(double) a1`
* **O que é:** Converte um tipo menor (`int`, de 32 bits) para um tipo maior (`double`, de 64 bits). 
* **Analogia:** Corresponde conceitualmente ao **upcasting**, pois vai de um tipo mais restrito para um mais amplo (não há perda de informação). Em Java, essa conversão geralmente é implícita, mas aqui foi feita de forma explícita para forçar que a divisão seja decimal e não inteira.

### 2. Casting de Estreitamento (*Narrowing Casting*)
Ocorre na linha 36: `(int) c1`
* **O que é:** Converte um tipo maior (`double`, de 64 bits) para um tipo menor (`int`, de 32 bits).
* **Analogia:** Corresponde conceitualmente ao **downcasting**, pois vai de um tipo mais amplo para um mais restrito, o que pode resultar em perda de precisão (a parte decimal `.0` é descartada). Por esse motivo, o compilador exige que o casting seja **explícito**.