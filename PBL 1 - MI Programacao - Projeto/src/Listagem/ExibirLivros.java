package Listagem;

import Busca.BuscarLivro;
import Obras.Acervo;
import Obras.Livro;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibir listas de livros com base em diferentes critérios. */
public class ExibirLivros {

    /**
     * Mostra a lista de livros conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha){
        if (escolha == 1){
            System.out.println("Lista de livros em ordem de crescente de avaliação:\n");
            Listagem.listarLivroTitulo(Acervo.getAcervo().getLivros());
        }
        else if (escolha == 2){
            System.out.println("Lista de livros em ordem de decrescente de avaliação:\n");
            Listagem.listarLivroReverso(Acervo.getAcervo().getLivros());
        }
        else if (escolha == 3){
            entrada.nextLine();
            System.out.println("Digite o gênero dos livros que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de livros do gênero " + genero + ":\n");
            ArrayList<Livro> lista = BuscarLivro.buscaGenero(genero);
            Listagem.listarLivroTitulo(lista);
        }
        else if (escolha == 4){
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento dos livros que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de livros do ano " + anoLancamento + ":\n");
            ArrayList<Livro> lista = BuscarLivro.buscaAnoLancamento(anoLancamento);
            Listagem.listarLivroTitulo(lista);
        }
    }
}
