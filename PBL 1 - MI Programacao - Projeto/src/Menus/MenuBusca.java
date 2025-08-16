package Menus;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de busca de obras no sistema.
 * Permite ao usuário escolher o tipo de obra (livros, filmes ou séries) a ser buscada.
 */
public class MenuBusca {

    /**
     * Exibe o menu de busca de obras e redireciona para o submenu específico
     * de acordo com a escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Opções de tipos de obras para buscar:\n");
            System.out.println("[1] - Livros");
            System.out.println("[2] - Filmes");
            System.out.println("[3] - Séries");
            System.out.println("[4] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de obra que deseja buscar: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> MenuBuscaLivros.mostrarMenu(entrada);
                case 2 -> MenuBuscaFilmes.mostrarMenu(entrada);
                case 3 -> MenuBuscaSeries.mostrarMenu(entrada);
            }
        }
    }
}
