package entities;

// import java.util.Random;

public class Funcionario {
    private static int proximoId = 1;
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        // this.id = new Random().nextInt(1, 100);
        this.id = proximoId++;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSalario() {
        this.salario += salario * 0.1;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: #%d - %s, salário: %.2f", id, nome, salario);
    }

}
