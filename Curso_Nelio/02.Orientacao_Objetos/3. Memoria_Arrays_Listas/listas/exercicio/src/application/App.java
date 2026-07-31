package application;

import java.util.Locale;
import java.util.List;

import entities.Funcionario;
import entities.Loja;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Loja loja01 = new Loja();
        List<Funcionario> lista = loja01.getListFunc();

        loja01.cadastrarVariosFunc();
        loja01.imprimeLista();

        loja01.aumentarSalario();
        loja01.imprimeLista();
    }

}
