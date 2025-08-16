package Testes.Unitarios;

import static org.junit.jupiter.api.Assertions.*;

import Obras.Filme;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe de testes unitários para a classe Filme.
 */
public class TestFilme {

    ArrayList<String> dir = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos"));
    ArrayList<String> rot = new ArrayList<>(Arrays.asList("Felipe", "Nicole"));
    ArrayList<String> ato = new ArrayList<>(Arrays.asList("Cauã", "Julia", "Bianca", "Davi"));

    /**
     * Testa se o título do filme é armazenado corretamente.
     */
    @Test
    public void testTitulo() {
        Filme filme = new Filme("Velozes", "Fast", "Ação", "2009",
                126, dir, rot, ato, "Netflix");
        assertEquals("Velozes", filme.getTitulo());
    }

    /**
     * Testa se o método alterarVisto marca corretamente o filme como visto.
     */
    @Test
    public void testAlterarVisto() {
        Filme filme = new Filme("Velozes", "Fast", "Ação", "2009",
                126, dir, rot, ato, "Netflix");

        String resposta = filme.alterarVisto("04/03/2025");
        assertTrue(filme.isVisto());
        assertEquals("Foi visto em 04/03/2025", resposta);
    }
}
