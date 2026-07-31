package application;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

import entities.Funcionario;
import entities.Loja;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Funcionario> lista = new ArrayList<>();
        Loja loja01 = new Loja(lista);

        loja01.cadastrarVariosFunc();

        loja01.imprimeLista();

        List<Integer> funcId = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            funcId.add(lista.get(i).getId());
        }

        for (int x : funcId) {
            System.out.println(x);
        }
    }

}
