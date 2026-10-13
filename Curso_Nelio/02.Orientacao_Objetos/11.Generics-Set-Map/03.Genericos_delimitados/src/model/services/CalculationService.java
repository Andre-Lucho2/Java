package model.services;

import java.util.List;

public class CalculationService {

    // public static <T extends Comparable<T>> T min(List<T> list)
    public static <T extends Comparable<? super T>> T min(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;

    }
}
