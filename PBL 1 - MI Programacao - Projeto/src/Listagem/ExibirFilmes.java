package Listagem;

import Busca.BuscarFilme;
import Obras.Acervo;
import Obras.Filme;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibir listas de filmes com base em diferentes critérios. */
public class ExibirFilmes {

    /**
     * Mostra a lista de filmes conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha){
        if (escolha == 1){
            System.out.println("Lista de filmes em ordem de crescente de avaliação:\n");
            Listagem.listarFilmeTitulo(Acervo.getAcervo().getFilmes());
        }
        else if (escolha == 2){
            System.out.println("Lista de filmes em ordem de decrescente de avaliação:\n");
            Listagem.listarFilmeReverso(Acervo.getAcervo().getFilmes());
        }
        else if (escolha == 3){
            entrada.nextLine();
            System.out.println("Digite o gênero dos filmes que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de filmes do gênero " + genero + ":\n");
            ArrayList<Filme> lista = BuscarFilme.buscaGenero(genero);
            Listagem.listarFilmeTitulo(lista);
        }
        else if (escolha == 4){
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento dos filmes que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de filmes do ano " + anoLancamento + ":\n");
            ArrayList<Filme> lista = BuscarFilme.buscaAnoLancamento(anoLancamento);
            Listagem.listarFilmeTitulo(lista);
        }
    }
}
