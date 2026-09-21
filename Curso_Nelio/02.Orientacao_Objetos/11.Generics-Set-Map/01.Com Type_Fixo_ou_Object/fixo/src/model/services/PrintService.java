package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value);
    }

    public Integer first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        for (Integer item : list) {
            System.out.print(", " + item);
        }
        System.out.println("]");
    }
}
