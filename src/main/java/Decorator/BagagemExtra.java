package Decorator;

public class BagagemExtra extends PassagemDecorator {
    public BagagemExtra(Passagem passagem) {
        super(passagem);
    }

    @Override
    public float getPrecoAdicional() {
        return 150.0f;
    }

    @Override
    public String getServicoAdicional() {
        return "Bagagem Extra";
    }
}
