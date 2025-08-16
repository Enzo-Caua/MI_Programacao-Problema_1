package Testes.Unitarios;

import static org.junit.jupiter.api.Assertions.*;

import Obras.Livro;
import org.junit.jupiter.api.Test;

/**
 * Classe de testes unitários para a classe Livro.
 */
public class TestLivro {

    /**
     * Testa se o título do livro é armazenado corretamente.
     */
    @Test
    public void testTitulo() {
        Livro livro = new Livro("Acotar", "Corte de Espinhos e Rosas", "Romance", "2017",
                "Sarah", "Galera", "978-3-16-148410-0", false);
        assertEquals("Acotar", livro.getTitulo());
    }

    /**
     * Testa se o método alterarVisto marca corretamente o livro como lido.
     */
    @Test
    public void testAlterarVisto() {
        Livro livro = new Livro("Acotar", "Corte de Espinhos e Rosas", "Romance", "2017",
                "Sarah", "Galera", "978-3-16-148410-0", false);

        String resposta = livro.alterarVisto("08/02/2024");
        assertTrue(livro.isVisto());
        assertEquals("Foi visto em 08/02/2024", resposta);
    }
}
