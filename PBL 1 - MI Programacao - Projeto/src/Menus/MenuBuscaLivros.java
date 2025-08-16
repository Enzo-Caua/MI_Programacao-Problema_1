package Menus;

import Busca.BuscarLivro;
import Listagem.Listagem;
import Obras.Livro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de filtros para busca de livros.
 * Permite realizar buscas por título, autor, gênero, ano de lançamento e ISBN.
 */
public class MenuBuscaLivros {

    /**
     * Exibe o menu de busca de livros e executa a ação com base na escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Filtros de busca:\n");
            System.out.println("[1] - Título do livro");
            System.out.println("[2] - Autor do livro");
            System.out.println("[3] - Gênero do livro");
            System.out.println("[4] - Ano de lançamento do livro");
            System.out.println("[5] - ISBN do livro");
            System.out.println("[6] - Voltar ao menu dos tipos de obras\n");
            System.out.print("Digite o número do filtro que deseja usar: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o título do livro:");
                    String titulo = entrada.nextLine();
                    System.out.println("Resultados da busca de livros pelo título " + titulo + ":");
                    ArrayList<Livro> lista = BuscarLivro.buscaTitulo(titulo);
                    Listagem.listarLivro(lista);
                }
                case 2 -> {
                    System.out.println("Digite o nome do(a) autor(a) do livro:");
                    String autor = entrada.nextLine();
                    System.out.println("Resultados da busca de livros pelo(a) autor(a) " + autor + ":");
                    ArrayList<Livro> lista = BuscarLivro.buscaAutor(autor);
                    Listagem.listarLivro(lista);
                }
                case 3 -> {
                    System.out.println("Digite o gênero do livro:");
                    String genero = entrada.nextLine();
                    System.out.println("Resultados da busca de livros pelo gênero " + genero + ":");
                    ArrayList<Livro> lista = BuscarLivro.buscaGenero(genero);
                    Listagem.listarLivro(lista);
                }
                case 4 -> {
                    System.out.println("Digite o ano de lançamento do livro:");
                    String anoLancamento = entrada.nextLine();
                    System.out.println("Resultados da busca de livros pelo ano " + anoLancamento + ":");
                    ArrayList<Livro> lista = BuscarLivro.buscaAnoLancamento(anoLancamento);
                    Listagem.listarLivro(lista);
                }
                case 5 -> {
                    System.out.println("Digite o código ISBN do livro:");
                    String isbn = entrada.nextLine();
                    System.out.println("Resultados da busca de livros pelo ISBN " + isbn + ":");
                    ArrayList<Livro> lista = BuscarLivro.buscaISBN(isbn);
                    Listagem.listarLivro(lista);
                }
            }
        }
    }
}
