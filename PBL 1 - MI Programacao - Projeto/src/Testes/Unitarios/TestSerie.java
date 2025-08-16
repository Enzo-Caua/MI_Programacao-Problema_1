package Testes.Unitarios;

import static org.junit.jupiter.api.Assertions.*;

import Obras.Serie;
import Obras.Temporada;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe de testes unitários para a classe Serie.
 */
public class TestSerie {

    ArrayList<String> dir = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos"));
    ArrayList<String> rot = new ArrayList<>(Arrays.asList("Felipe", "Nicole"));
    ArrayList<String> ato = new ArrayList<>(Arrays.asList("Cauã", "Julia", "Bianca", "Davi"));

    /**
     * Testa se o título da série é armazenado corretamente.
     */
    @Test
    public void testTitulo() {
        Serie serie = new Serie("Sobrenatural", "Supernatural", "Fantasia", "2010",
                dir, rot, ato, "Netflix");
        assertEquals("Sobrenatural", serie.getTitulo());
    }

    /**
     * Testa se a avaliação da série pode ser atribuída e recuperada corretamente.
     */
    @Test
    public void testSetAndGetAvaliacao() {
        Serie serie = new Serie("Sobrenatural", "Supernatural", "Fantasia", "2010",
                dir, rot, ato, "Netflix");
        serie.setAvaliacao(5);
        assertEquals(5, serie.getAvaliacao());
    }

    /**
     * Testa se uma temporada pode ser adicionada corretamente à série.
     */
    @Test
    public void testAdicionarTemporada() {
        Serie serie = new Serie("Sobrenatural", "Supernatural", "Fantasia", "2010",
                dir, rot, ato, "Netflix");
        Temporada temporada = new Temporada("2004", 20, 1);
        serie.addTemporadas(temporada);
        assertEquals(1, serie.getTemporadas().size());
        assertEquals(1, serie.getTemporadas().get(0).getTempNumero());
    }

    /**
     * Testa o cálculo da média das avaliações das temporadas da série.
     */
    @Test
    public void testAvaliacaoMediaTemporadas() {
        Serie serie = new Serie("Sobrenatural", "Supernatural", "Fantasia", "2010",
                dir, rot, ato, "Netflix");

        Temporada t1 = new Temporada("2004", 20, 1);
        Temporada t2 = new Temporada("2005", 22, 2);
        t1.setAvaliacao(4);
        t2.setAvaliacao(2);

        serie.addTemporadas(t1);
        serie.addTemporadas(t2);

        serie.addAvaliacaoTemporadas(t1.getAvaliacao());
        serie.addAvaliacaoTemporadas(t2.getAvaliacao());

        assertEquals(3, serie.getAvaliacao()); // (4 + 2) / 2 = 3
    }
}
