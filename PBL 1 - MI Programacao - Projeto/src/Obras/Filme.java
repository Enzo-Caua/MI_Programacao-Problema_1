package Obras;

import java.util.ArrayList;

/** Classe que representa um filme, estendendo a classe Midia. */
public class Filme extends Midia {

    /** Duração do filme em minutos. */
    private final int duracao;

    /** Lista de diretores do filme. */
    private final ArrayList<String> diretores;

    /** Lista de roteiristas do filme. */
    private final ArrayList<String> roteiristas;

    /** Lista de atores do filme. */
    private final ArrayList<String> atores;

    /** Plataforma de exibição do filme (ex: Netflix, cinema). */
    private final String plataforma;

    /** Construtor da classe Filme. */
    public Filme(String titulo, String tituloOriginal, String genero, String anoLancamento,
                 int duracao, ArrayList<String> diretores, ArrayList<String> roteiristas,
                 ArrayList<String> atores, String plataforma) {
        super(titulo, tituloOriginal, genero, anoLancamento);
        this.diretores = diretores;
        this.roteiristas = roteiristas;
        this.atores = atores;
        this.duracao = duracao;
        this.plataforma = plataforma;
    }

    /** Retorna a duração do filme. */
    public int getDuracao() {
        return duracao;
    }

    /** Retorna a lista de diretores do filme. */
    public ArrayList<String> getDiretores() {
        return diretores;
    }

    /** Retorna a lista de roteiristas do filme. */
    public ArrayList<String> getRoteiristas() {
        return roteiristas;
    }

    /** Retorna a lista de atores do filme. */
    public ArrayList<String> getAtores() {
        return atores;
    }

    /** Retorna a plataforma onde o filme foi exibido. */
    public String getPlataforma() {
        return plataforma;
    }

    /** Retorna uma representação textual completa do filme. */
    @Override
    public String toString() {
        return "Título: " + titulo  +
                "\nTítulo Original: " + tituloOriginal +
                "\nGênero: " + genero +
                "\nAno de Lançamento: " + anoLancamento +
                "\nDuração: " + duracao +
                "\nDiretor(es): " + diretores +
                "\nRoteirista(s): " + roteiristas +
                "\nAtor(es): " + atores +
                "\nPlataforma: " + plataforma +
                "\nNota: " + avaliacao +
                "\nReview: " + review +
                "\nFoi visto: " + (visto ? ("Sim \nData de visualização: " + dataVisto) : "Não");
    }
}
