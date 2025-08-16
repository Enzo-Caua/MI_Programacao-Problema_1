package Obras;

/** Classe que representa um livro, estendendo a classe Midia. */
public class Livro extends Midia {

    /** Nome do autor do livro. */
    private final String autor;

    /** Nome da editora do livro. */
    private final String editora;

    /** Código ISBN do livro. */
    private final String isbn;

    /** Indica se o livro está disponível fisicamente. */
    private boolean disponivel;

    /** Construtor da classe Livro. */
    public Livro(String titulo, String tituloOriginal, String genero, String anoLancamento,
                 String autor, String editora, String isbn, boolean disponivel) {
        super(titulo, tituloOriginal, genero, anoLancamento);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    /** Retorna o nome do autor do livro. */
    public String getAutor() {
        return autor;
    }

    /** Retorna o nome da editora do livro. */
    public String getEditora() {
        return editora;
    }

    /** Retorna o código ISBN do livro. */
    public String getIsbn() {
        return isbn;
    }

    /** Retorna true se o livro está disponível. */
    public boolean isDisponivel() {
        return disponivel;
    }

    /** Alterna o estado de disponibilidade do livro. */
    public void alterarDisponivel() {
        this.disponivel = !this.disponivel;
    }

    /** Retorna uma representação textual completa do livro. */
    @Override
    public String toString() {
        return "Título: " + titulo  +
                "\nTítulo Original: " + tituloOriginal +
                "\nGênero: " + genero +
                "\nAno de Lançamento: " + anoLancamento +
                "\nAutor: " + autor +
                "\nEditora: " + editora +
                "\nISBN: " + isbn +
                "\nPossui exemplar: " + (disponivel ? "Sim" : "Não") +
                "\nNota: " + avaliacao +
                "\nReview: " + review +
                "\nFoi lido: " + (visto ? ("Sim \nData de leitura: " + dataVisto) : "Não");
    }
}
