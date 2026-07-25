import java.util.Locale;
import java.util.Scanner;

public class Main {
/* 
    public static void main(String[] args){
        System.out.println("Olá Mundo");
    }
}

    Mesma sintaxe acima em Java 25:
    --------------------------------

    void main() {
        IO.println("Olá Mundo");
    }

*/
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        
    // Boa prática de escrita de tipos primitivos:
    // --------------------------------------------
        double a = 6.0;
        double b = 7.0;
        float c = 8f;
        long d = 1L;
        
    // Casting Explícito int para double:
    // --------------------------------------------

    // 1)
        int a1 = 5;
        int b1 = 2;
        
        double resultado = (double) a1 / b1;
        
        // System.out.println(resultado);
        
    // 2)
        double c1 = 5.0;
        int d1 = (int) c1;
        
        // System.out.println(d1);
        

    /* Entradas
    ------------------
    Scanner sc = new Scanner(System.in);
    
    println() --> não considera as configurações regionais do SO --> imprime conforme o tipo de dado passado
    printf() --> considera as configurações do SO --> necessita setar o Locale 

    1)
    Para receber tipo char
    char ch = sc.next().charAt(0); --> pega o primeiro elemento

    Para fazer uma leitura de dados até a proxima linha(incluindo espacos e demais caracteres):
    String s1 = sc.nextLine();
    

    Funções matemáticas:
    --------------------------
    
    Biblioteca Math:
    --------------------------
    
    Math.sqrt(x) --> raiz quadrada
    Math.pow(x, y) --> potencia
    Math.abs() --> valor absoluto
    Math.ceil() --> arredonda para cima
    Math.floor() --> arredonda para baixo
    Math.PI
    ...
    
    */
    
    
    }
}
