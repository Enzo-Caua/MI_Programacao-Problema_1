package Menus;

import Busca.BuscarFilme;
import Listagem.Listagem;
import Obras.Filme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de filtros para busca de filmes.
 * Permite buscar filmes por título, diretor, ator, gênero ou ano de lançamento.
 */
public class MenuBuscaFilmes {

    /**
     * Exibe o menu de filtros e executa a busca de acordo com a opção escolhida pelo usuário.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Filtros de busca:\n");
            System.out.println("[1] - Título do filme");
            System.out.println("[2] - Diretor do filme");
            System.out.println("[3] - Ator no elenco do filme");
            System.out.println("[4] - Gênero do filme");
            System.out.println("[5] - Ano de lançamento do filme");
            System.out.println("[6] - Voltar ao menu dos tipos de obras\n");
            System.out.print("Digite o número do filtro que deseja usar: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Consome quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o título do filme:");
                    String titulo = entrada.nextLine();
                    System.out.println("Resultados da busca de filmes pelo título " + titulo + ":");
                    ArrayList<Filme> lista = BuscarFilme.buscaTitulo(titulo);
                    Listagem.listarFilme(lista);
                }
                case 2 -> {
                    System.out.println("Digite o nome do(a) diretor(a) do filme:");
                    String diretor = entrada.nextLine();
                    System.out.println("Resultados da busca de filmes pelo(a) diretor(a) " + diretor + ":");
                    ArrayList<Filme> lista = BuscarFilme.buscaDiretor(diretor);
                    Listagem.listarFilme(lista);
                }
                case 3 -> {
                    System.out.println("Digite o nome do ator:");
                    String ator = entrada.nextLine();
                    System.out.println("Resultados da busca de filmes pelo ator " + ator + ":");
                    ArrayList<Filme> lista = BuscarFilme.buscaAtor(ator);
                    Listagem.listarFilme(lista);
                }
                case 4 -> {
                    System.out.println("Digite o gênero do filme:");
                    String genero = entrada.nextLine();
                    System.out.println("Resultados da busca de filmes pelo gênero " + genero + ":");
                    ArrayList<Filme> lista = BuscarFilme.buscaGenero(genero);
                    Listagem.listarFilme(lista);
                }
                case 5 -> {
                    System.out.println("Digite o ano de lançamento do filme:");
                    String anoLancamento = entrada.nextLine();
                    System.out.println("Resultados da busca de filmes pelo ano " + anoLancamento + ":");
                    ArrayList<Filme> lista = BuscarFilme.buscaAnoLancamento(anoLancamento);
                    Listagem.listarFilme(lista);
                }
            }
        }
    }
}
