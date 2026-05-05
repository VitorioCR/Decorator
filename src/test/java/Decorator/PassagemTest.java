package Decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassagemTest {

    @Test
    void deveRetornarPrecoPassagem() {
        Passagem passagem = new PassagemEconomica(500.0f);
        assertEquals(500.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComBagagemExtra() {
        Passagem passagem = new BagagemExtra(new PassagemEconomica(500.0f));
        assertEquals(650.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComEmbarquePrioritario() {
        Passagem passagem = new EmbarquePrioritario(new PassagemEconomica(500.0f));
        assertEquals(550.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComAssentoConforto() {
        Passagem passagem = new AssentoConforto(new PassagemEconomica(500.0f));
        assertEquals(600.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComBagagemExtraMaisEmbarquePrioritario() {
        Passagem passagem = new BagagemExtra(new EmbarquePrioritario(new PassagemEconomica(500.0f)));
        assertEquals(700.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComBagagemExtraMaisAssentoConforto() {
        Passagem passagem = new BagagemExtra(new AssentoConforto(new PassagemEconomica(500.0f)));
        assertEquals(750.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComEmbarquePrioritarioMaisAssentoConforto() {
        Passagem passagem = new EmbarquePrioritario(new AssentoConforto(new PassagemEconomica(500.0f)));
        assertEquals(650.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPassagemComTodosOsServicos() {
        Passagem passagem = new BagagemExtra(new EmbarquePrioritario(new AssentoConforto(new PassagemEconomica(500.0f))));
        assertEquals(800.0f, passagem.getPreco());
    }

    @Test
    void deveRetornarDescricaoPassagem() {
        Passagem passagem = new PassagemEconomica();
        assertEquals("Passagem Econômica", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComBagagemExtra() {
        Passagem passagem = new BagagemExtra(new PassagemEconomica());
        assertEquals("Passagem Econômica + Bagagem Extra", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComEmbarquePrioritario() {
        Passagem passagem = new EmbarquePrioritario(new PassagemEconomica());
        assertEquals("Passagem Econômica + Embarque Prioritário", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComAssentoConforto() {
        Passagem passagem = new AssentoConforto(new PassagemEconomica());
        assertEquals("Passagem Econômica + Assento Conforto", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComBagagemExtraMaisEmbarquePrioritario() {
        Passagem passagem = new BagagemExtra(new EmbarquePrioritario(new PassagemEconomica()));
        assertEquals("Passagem Econômica + Embarque Prioritário + Bagagem Extra", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComBagagemExtraMaisAssentoConforto() {
        Passagem passagem = new BagagemExtra(new AssentoConforto(new PassagemEconomica()));
        assertEquals("Passagem Econômica + Assento Conforto + Bagagem Extra", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComEmbarquePrioritarioMaisAssentoConforto() {
        Passagem passagem = new EmbarquePrioritario(new AssentoConforto(new PassagemEconomica()));
        assertEquals("Passagem Econômica + Assento Conforto + Embarque Prioritário", passagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPassagemComTodosOsServicos() {
        Passagem passagem = new BagagemExtra(new EmbarquePrioritario(new AssentoConforto(new PassagemEconomica())));
        assertEquals("Passagem Econômica + Assento Conforto + Embarque Prioritário + Bagagem Extra", passagem.getDescricao());
    }
}
