package Decorator;

public class PassagemEconomica implements Passagem {
    private float preco;

    public PassagemEconomica() {
        this.preco = 500.0f;
    }

    public PassagemEconomica(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Passagem Econômica";
    }
}
