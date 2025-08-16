package Listagem;

import Obras.Filme;
import Obras.Livro;
import Obras.Serie;

import java.util.ArrayList;

/** Interface que fornece métodos estáticos para listagem de mídias (livros, filmes e séries). */
public interface Listagem<T> {

    /** Lista detalhadamente todos os livros da coleção. */
    public static void listarLivro(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            System.out.println(livro.toString() + "\n");
        }
    }

    /** Lista o título e a avaliação de cada livro. */
    public static void listarLivroTitulo(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            System.out.println(livro.getTitulo() + " - " + livro.getAvaliacao() + " estrelas\n");
        }
    }

    /** Lista os livros em ordem reversa com título e avaliação. */
    public static void listarLivroReverso(ArrayList<Livro> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i).getTitulo() + " - " + lista.get(i).getAvaliacao() + " estrelas\n");
        }
    }

    /** Lista detalhadamente todos os filmes da coleção. */
    public static void listarFilme(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            System.out.println(filme.toString() + "\n");
        }
    }

    /** Lista o título e a avaliação de cada filme. */
    public static void listarFilmeTitulo(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            System.out.println(filme.getTitulo() + " - " + filme.getAvaliacao() + " estrelas\n");
        }
    }

    /** Lista os filmes em ordem reversa com título e avaliação. */
    public static void listarFilmeReverso(ArrayList<Filme> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i).getTitulo() + " - " + lista.get(i).getAvaliacao() + " estrelas\n");
        }
    }

    /** Lista detalhadamente todas as séries da coleção. */
    public static void listarSerie(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            System.out.println(serie.toString() + "\n");
        }
    }

    /** Lista o título e a avaliação de cada série. */
    public static void listarSerieTitulo(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            System.out.println(serie.getTitulo() + " - " + serie.getAvaliacao() + " estrelas\n");
        }
    }

    /** Lista as séries em ordem reversa com título e avaliação. */
    public static void listarSerieReverso(ArrayList<Serie> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i).getTitulo() + " - " + lista.get(i).getAvaliacao() + " estrelas\n");
        }
    }
}
