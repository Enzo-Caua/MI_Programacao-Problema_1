package Cadastro;

import Obras.Acervo;
import Obras.Livro;

import java.util.Scanner;

/** Classe responsável por cadastrar livros no acervo. */
public class CadastrarLivro {

    /**
     * Solicita os dados do livro ao usuário e o adiciona ao acervo.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosLivro(Scanner entrada) {
        boolean disponivel = false;

        System.out.println("Digite os dados solicitados a seguir:");

        entrada.nextLine();

        System.out.println("Título do livro:");
        String titulo = entrada.nextLine();

        System.out.println("Título original do livro:");
        String tituloOriginal = entrada.nextLine();

        System.out.println("Gênero do livro:");
        String genero = entrada.nextLine();

        System.out.println("Ano de lançamento do livro:");
        String anoLancamento = entrada.nextLine();

        System.out.println("Nome do(a) autor(a) do livro:");
        String autor = entrada.nextLine();

        System.out.println("Nome da editora:");
        String editora = entrada.nextLine();

        System.out.println("Código ISBN:");
        String isbn = entrada.nextLine();

        System.out.println("Possui exemplar do livro?");
        String posse = entrada.nextLine().toUpperCase();
        if (posse.equals("SIM")) {
            disponivel = true;
        } else if (posse.equals("NAO") || posse.equals("NÃO")) {
            disponivel = false;
        }

        Livro livro = new Livro(titulo, tituloOriginal, genero, anoLancamento,
                autor, editora, isbn, disponivel);
        Acervo.getAcervo().addLivro(livro);

        System.out.println("O livro " + titulo + " foi cadastrado com sucesso!\n");
        System.out.println(livro.toString());
    }
}
