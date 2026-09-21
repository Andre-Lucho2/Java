package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    /*
     * Object é um tipo mto genérico --> tudo em Java herda de Object -->
     * // NÃO TENHO NENHUM TIPO DE Type Safety!
     */
    private List<Object> list = new ArrayList<>();

    public void addValue(Object value) {
        list.add(value);
    }

    public Object first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        for (Object item : list) {
            System.out.print(item + ", ");
        }
        System.out.println("]");
    }
}
