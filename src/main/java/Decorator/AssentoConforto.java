package Decorator;

public class AssentoConforto extends PassagemDecorator {
    public AssentoConforto(Passagem passagem) {
        super(passagem);
    }

    @Override
    public float getPrecoAdicional() {
        return 100.0f;
    }

    @Override
    public String getServicoAdicional() {
        return "Assento Conforto";
    }
}
