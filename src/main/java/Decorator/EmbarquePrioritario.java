package Decorator;

public class EmbarquePrioritario extends PassagemDecorator {
    public EmbarquePrioritario(Passagem passagem) {
        super(passagem);
    }

    @Override
    public float getPrecoAdicional() {
        return 50.0f;
    }

    @Override
    public String getServicoAdicional() {
        return "Embarque Prioritário";
    }
}
