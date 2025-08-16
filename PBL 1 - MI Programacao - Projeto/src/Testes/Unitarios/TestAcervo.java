package Testes.Unitarios;

import Obras.Acervo;
import Obras.Filme;
import Obras.Livro;
import Obras.Serie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para a classe Acervo.
 * Verifica o comportamento de singleton, adição de elementos e ordenação de livros.
 */
public class TestAcervo {

    /**
     * Limpa o acervo antes de cada teste.
     * Garante independência entre os testes.
     */
    @BeforeEach
    public void limparAcervo() {
        Acervo acervo = Acervo.getAcervo();
        acervo.getLivros().clear();
        acervo.getFilmes().clear();
        acervo.getSeries().clear();
    }

    /**
     * Testa se a instância do Acervo é realmente singleton.
     */
    @Test
    public void testInstanciaSingleton() {
        Acervo acervo1 = Acervo.getAcervo();
        Acervo acervo2 = Acervo.getAcervo();
        assertSame(acervo1, acervo2); // Deve ser a mesma instância
    }

    /**
     * Testa a adição de um livro ao acervo.
     */
    @Test
    public void testAddLivro() {
        Livro livro = new Livro("Acotar", "Corte de Espinhos e Rosas", "Romance", "2017",
                "Sarah", "Galera", "978-3-16-148410-0", false);
        livro.setAvaliacao(3);

        Acervo.getAcervo().addLivro(livro);
        ArrayList<Livro> livros = Acervo.getAcervo().getLivros();

        assertEquals(1, livros.size(), "Deveria haver um livro no acervo");
        assertEquals("Acotar", livros.getFirst().getTitulo(), "O título do livro não confere");
    }

    /**
     * Testa se os livros no acervo são ordenados pela avaliação, do maior para o menor.
     */
    @Test
    public void testOrdenacaoLivrosPorAvaliacao() {
        Livro livro1 = new Livro("Mentirosos", "Mentirosos", "Drama", "2010",
                "Matheus", "Saraivah", "978-3-16-148410-0", false);
        livro1.setAvaliacao(5);

        Livro livro2 = new Livro("Acotar", "Corte de Espinhos e Rosas", "Romance", "2017",
                "Sarah", "Galera", "978-3-16-148410-0", false);
        livro2.setAvaliacao(3);

        Acervo.getAcervo().addLivro(livro1);
        Acervo.getAcervo().addLivro(livro2);

        ArrayList<Livro> livros = Acervo.getAcervo().getLivros();
        assertEquals("Mentirosos", livros.getFirst().getTitulo(), "Livro com maior avaliação deveria estar em primeiro");
    }

    /**
     * Testa a adição de um filme ao acervo.
     */
    @Test
    public void testAddFilme() {
        ArrayList<String> dir = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos"));
        ArrayList<String> rot = new ArrayList<>(Arrays.asList("Felipe", "Nicole"));
        ArrayList<String> ato = new ArrayList<>(Arrays.asList("Cauã", "Julia", "Bianca", "Davi"));

        Filme filme = new Filme("Velozes", "Fast", "Ação", "2009",
                126, dir, rot, ato, "Netflix");
        filme.setAvaliacao(2);

        Acervo.getAcervo().addFilme(filme);
        ArrayList<Filme> filmes = Acervo.getAcervo().getFilmes();

        assertEquals(1, filmes.size());
        assertEquals("Velozes", filmes.getFirst().getTitulo());
    }

    /**
     * Testa a adição de uma série ao acervo.
     */
    @Test
    public void testAddSerie() {
        ArrayList<String> dir = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos"));
        ArrayList<String> rot = new ArrayList<>(Arrays.asList("Felipe", "Nicole"));
        ArrayList<String> ato = new ArrayList<>(Arrays.asList("Cauã", "Julia", "Bianca", "Davi"));

        Serie serie = new Serie("Sobrenatural", "Supernatural", "Fantasia", "2010",
                dir, rot, ato, "Netflix");
        serie.setAvaliacao(5);

        Acervo.getAcervo().addSerie(serie);
        ArrayList<Serie> series = Acervo.getAcervo().getSeries();

        assertEquals(1, series.size());
        assertEquals("Sobrenatural", series.getFirst().getTitulo());
    }
}
