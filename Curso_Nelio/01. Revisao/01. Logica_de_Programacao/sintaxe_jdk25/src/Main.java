import java.util.Locale;

//public class Main {
//    public static void main(String[] args){
//        System.out.print("Olá Mundo");
//    }
//}

// Sintaxe Java 25:

void main(){

    IO.println("Olá Mundo");
    Locale.setDefault(Locale.US); //separador de decimais em US

    double x = 10.35784;
//    System.out.printf("%.2f\n", x);


//    Boa prática de escrita de tipos primitivos:
    double a = 6.0;
    double b = 7.0;
    float c = 8f;
    long d = 1L;


//   Casting int para double:
    int a1 = 5;
    int b1 = 2;

    double resultado = (double) a1 / b1;
    IO.println(resultado) ;

    double c1 = 5.0;
    int d1 = c1;

    



}