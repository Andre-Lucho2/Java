package entities;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    Scanner sc = new Scanner(System.in);

    private List<Funcionario> listaFunc;

    public Loja() {
        this.listaFunc = new ArrayList<>();
    }

    public List<Funcionario> getListFunc() {
        return listaFunc;
    }

    public Funcionario cadastrarFuncionario() {
        System.out.println("Digite o nome:");
        String nome = sc.next();
        System.out.println("Digite o salario:");
        Double salario = sc.nextDouble();

        Funcionario func = new Funcionario(nome, salario);
        listaFunc.add(func);
        return func;
    }

    public void cadastrarVariosFunc() {
        System.out.println("Entre com a quantidade de funcionarios a cadastrar:");
        int numeroFunc = sc.nextInt();

        for (int i = 0; i < numeroFunc; i++) {
            this.cadastrarFuncionario();
        }
    }

    public void aumentarSalario() {
        if (listaFunc.size() > 0) {
            System.out.println("Para adicionar um aumento no salário, digite o 'id' do funcionário: ");
            int id = sc.nextInt();

            Funcionario buscaID = listaFunc.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);

            if (buscaID != null) {
                buscaID.setSalario();
            } else {
                System.out.println("Id do funcionário não encontrado");
            }
        }
    }

    public void imprimeLista() {
        if (listaFunc.size() != 0) {
            for (Funcionario func : listaFunc) {
                System.out.println(func);
            }
        }
    }
}
