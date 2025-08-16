package Menus;

import Listagem.ExibirFilmes;
import Listagem.ExibirLivros;
import Listagem.ExibirSeries;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de listagem de obras (livros, filmes e séries).
 * Permite ao usuário escolher o tipo de obra e aplicar filtros de ordenação para exibição.
 */
public class MenuListas {

    /**
     * Exibe o menu de listagens de obras, permitindo ao usuário escolher
     * entre livros, filmes ou séries, e aplicar filtros como avaliação,
     * gênero e ano de lançamento.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Opções de listas:\n");
            System.out.println("[1] - Listas de livros");
            System.out.println("[2] - Listas de filmes");
            System.out.println("[3] - Listas de séries");
            System.out.println("[4] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de listas que deseja: ");
            opcao = entrada.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                System.out.println("Opções de filtragem:\n");
                System.out.println("[1] - Listar por ordem crescente de avaliação");
                System.out.println("[2] - Listar por ordem decrescente de avaliação");
                System.out.println("[3] - Listar por gênero");
                System.out.println("[4] - Listar por ano de lançamento");
                System.out.println("[5] - Voltar ao menu de opções de listas");
                System.out.print("Escolha o filtro desejado: ");
                int escolha = entrada.nextInt();

                if (opcao == 1) {
                    ExibirLivros.mostrarLista(entrada, escolha);
                } else if (opcao == 2) {
                    ExibirFilmes.mostrarLista(entrada, escolha);
                } else if (opcao == 3) {
                    ExibirSeries.mostrarLista(entrada, escolha);
                }
            }
        }
    }
}
