package entities;

public class Quarto {
    private int numero;
    private boolean alugado;
    private Estudante estudante;

    public Quarto() {
    };

    public Quarto(int numero, boolean alugado, Estudante estudante) {
        this.numero = numero;
        this.alugado = alugado;
        this.estudante = estudante;
    }

    public Quarto(int numero, boolean alugado) {
        this.numero = numero;
        this.alugado = alugado;
    }

    public Quarto(int numero) {
        this.numero = numero;
        this.alugado = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String isAlugado() {
        String ocupação;
        if (this.alugado == true) {
            ocupação = "alugado";
        } else {
            ocupação = "vazio";
        }
        return ocupação;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public String getEstudante() {
        if (estudante != null) {
            return estudante.toString();
        } else {
            return "não consta";
        }
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return String.format("Quarto: #%d: %s, Estudante: %s", (numero + 1), this.isAlugado(), this.getEstudante());
    }

}
