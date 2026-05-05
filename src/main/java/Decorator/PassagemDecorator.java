package Decorator;

public abstract class PassagemDecorator implements Passagem {
    private Passagem passagem;

    public PassagemDecorator(Passagem passagem) {
        this.passagem = passagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public abstract float getPrecoAdicional();

    @Override
    public float getPreco() {
        return this.passagem.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getServicoAdicional();

    @Override
    public String getDescricao() {
        return this.passagem.getDescricao() + " + " + this.getServicoAdicional();
    }
}
