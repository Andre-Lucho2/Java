package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // a.

        // List<Object> não é o supertipo de Integer
        List<Object> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        // myObjs = myNumbers; // erro de conversão

        // !=
        Object obj;
        Integer inteiro = 10;
        obj = inteiro; // Object é supertipo de Integer == ok

        // b.

        // <?> --> supertipo de qquer tipo de List<>
        List<?> myObjs2 = new ArrayList<Object>();
        List<Integer> myNumbers2 = new ArrayList<Integer>();
        myObjs2 = myNumbers2; // ok

        // c.

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myListStr = Arrays.asList("Andre", "Paulo", "Daniel");
        printList(myListStr);

    }

    // c.

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

        // list.add(10); erro de compilação
        // Como a list é do tipo curinga(?) --> O compilador não sabe qual é o tipo
        // de list foi instanciado.
    }

}
