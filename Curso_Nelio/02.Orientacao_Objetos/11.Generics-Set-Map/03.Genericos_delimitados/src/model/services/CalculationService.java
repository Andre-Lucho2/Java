package model.services;

import java.util.List;

// a classe não é genérica - apenas o método
public class CalculationService {

    /*
     * Apenas o método é Generico
     * 
     * Assinatura:
     * -----------
     * a) public static <T> --> parametrização o método como um generic do tipo "T"
     * b) T max --> é o retorno de um tipo "T" método chamado "max"
     * c) List<T> --> recebe uma lista parametrizada como generic de tipo "T"
     * 
     * 
     * d) <T extends Comparable> --> como estou implementando a interface
     * "Comparable" tenho q indicar que a
     * parametrização do meu método generic <T> herda para qquer subtipo de
     * "Comparable"
     * ; além disso:
     * d.1) Comparable<T> --> Comparable tb está parametrizado como tipo "T" para
     * casar com o mesmo tipo do meu método
     * 
     * final == <T extends Comparable<T>>
     * 
     * 
     * Mais completo:
     * public static <T extends Comparable<? super T>> T max(List<T> list) {}
     * 
     * <? super T> --> Tipo generico Comparable<T> ou qquer superclasse de "T":
     * aqui --> Product ou qquer superclasse de Product
     * 
     * 
     * 
     * 
     */

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;

    }
}
