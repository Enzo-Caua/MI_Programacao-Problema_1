package Avaliacao;

import Busca.BuscarSerie;
import Obras.Temporada;
import Obras.Serie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável por permitir avaliação e escrita de reviews
 * para temporadas de séries específicas.
 */
public class AvaliarTemporada {

    /**
     * Permite ao usuário avaliar uma temporada específica de uma série.
     * A nota é atribuída diretamente à temporada e influencia a média da série.
     *
     * @param entrada Scanner utilizado para entrada de dados do usuário.
     */
    public static void pontuarTemporada(Scanner entrada) {
        entrada.nextLine();

        System.out.println("Digite o título da série que deseja avaliar:");
        String titulo = entrada.nextLine();
        ArrayList<Serie> lista = BuscarSerie.buscaTitulo(titulo);
        Serie serie = lista.getFirst();

        System.out.println("Digite o número da temporada que deseja pontuar:");
        int num = entrada.nextInt();
        Temporada temporada = BuscarSerie.buscaTemporada(num, serie);

        System.out.println("Digite um número inteiro (1 a 5) para pontuar a temporada " +
                temporada.getTempNumero() + " de " + serie.getTitulo() + ":");
        int pontuacao = entrada.nextInt();
        temporada.setAvaliacao(pontuacao);
        serie.addAvaliacaoTemporadas(pontuacao);

        System.out.println("A temporada " + temporada.getTempNumero() +
                " foi avaliada com a nota " + temporada.getAvaliacao() + "!");
    }

    /**
     * Permite ao usuário escrever uma review para uma temporada específica de uma série.
     *
     * @param entrada Scanner utilizado para entrada de dados do usuário.
     */
    public static void reviewTemporada(Scanner entrada) {
        entrada.nextLine();

        System.out.println("Digite o título da série que deseja avaliar:");
        String titulo = entrada.nextLine();
        ArrayList<Serie> lista = BuscarSerie.buscaTitulo(titulo);
        Serie serie = lista.getFirst();

        System.out.println("Digite o número da temporada que deseja fazer review:");
        int num = entrada.nextInt();
        Temporada temporada = BuscarSerie.buscaTemporada(num, serie);

        entrada.nextLine(); // limpar buffer

        System.out.println("Digite a sua review para a temporada " +
                temporada.getTempNumero() + " de " + serie.getTitulo() + ":");
        String review = entrada.nextLine();
        temporada.setReview(review);

        System.out.println("A temporada " + temporada.getTempNumero() +
                " teve a review cadastrada com sucesso!");
    }
}
