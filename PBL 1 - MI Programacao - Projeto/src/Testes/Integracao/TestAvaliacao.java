package Testes.Integracao;

import Obras.Acervo;
import Obras.Livro;
import Busca.BuscarLivro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste de integração para avaliação e review de livros.
 */
public class TestAvaliacao {

    /**
     * Configura o ambiente antes de cada teste.
     * Limpa o acervo e adiciona um livro para garantir testes isolados.
     */
    @BeforeEach
    public void setup() {
        // Limpa o acervo para evitar interferência de outros testes
        Acervo.getAcervo().getLivros().clear();

        // Cria e adiciona um livro ao acervo
        Livro livro = new Livro(
                "Dom Casmurro",
                "Dom Casmurro",
                "Romance",
                "1899",
                "Machado de Assis",
                "Editora A",
                "1234567890",
                false
        );

        Acervo.getAcervo().addLivro(livro);
    }

    /**
     * Testa o processo completo de marcar um livro como visto, avaliar e adicionar uma review.
     */
    @Test
    public void testAvaliacaoEReview() {
        // Busca o livro pelo título
        ArrayList<Livro> resultadoBusca = BuscarLivro.buscaTitulo("Dom Casmurro");
        assertFalse(resultadoBusca.isEmpty(), "Livro não encontrado na busca");

        Livro livro = resultadoBusca.getFirst();

        // Marca como visto
        String msgVisto = livro.alterarVisto("17/04/2025");
        assertTrue(livro.isVisto(), "Livro deveria estar marcado como lido");
        assertEquals("Visto em: 17/04/2025", livro.getDataVisto(), "Data de visualização incorreta");

        // Avaliação
        livro.setAvaliacao(5);
        assertEquals(5, livro.getAvaliacao(), "Avaliação incorreta");

        // Review
        livro.setReview("Um clássico da literatura brasileira.");
        assertEquals("Um clássico da literatura brasileira.", livro.getReview(), "Review não foi salva corretamente");
    }
}
