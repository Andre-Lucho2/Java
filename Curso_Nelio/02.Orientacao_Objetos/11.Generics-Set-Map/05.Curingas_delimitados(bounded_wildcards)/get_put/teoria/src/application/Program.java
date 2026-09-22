package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Covariância --> .get() permitida | .add() ou put --> não permitida
        // ------------------------------------

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0); // ok

        // list.add(20); // erro de compilacao --> o Compilador não sabe se '20' é um
        // subtipo de Number

        // ------------------------------------
        // Contra-variância --> .get() não permitida | .add() ou put --> permitida
        // ------------------------------------

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        Object y = myNums.get(0); // ok

        // Number y1 = myNums.get(0); // erro de compilacao
        // y1 --> pode ser Number ou um supertipo de Number --> o compilador não sabe
        // qual deles será!

    }

}
