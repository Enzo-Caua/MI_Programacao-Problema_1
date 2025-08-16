package Menus;

import Avaliacao.AvaliarFilme;
import Avaliacao.AvaliarLivro;
import Avaliacao.AvaliarTemporada;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de avaliação de obras no sistema.
 * Permite que o usuário atribua notas e escreva reviews para livros, filmes e temporadas de séries.
 */
public class    MenuAvaliacao {

    /**
     * Exibe o menu de avaliações e executa a ação correspondente com base na escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("Opções de avaliação:\n");
            System.out.println("[1] - Atribuir nota a um livro");
            System.out.println("[2] - Escrever review de um livro");
            System.out.println("[3] - Atribuir nota a um filme");
            System.out.println("[4] - Escrever review de um filme");
            System.out.println("[5] - Atribuir nota a uma temporada de uma série");
            System.out.println("[6] - Escrever review de uma temporada de uma série");
            System.out.println("[7] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de avaliação que deseja realizar: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> AvaliarLivro.pontuarLivro(entrada);
                case 2 -> AvaliarLivro.reviewLivro(entrada);
                case 3 -> AvaliarFilme.pontuarFilme(entrada);
                case 4 -> AvaliarFilme.reviewFilme(entrada);
                case 5 -> AvaliarTemporada.pontuarTemporada(entrada);
                case 6 -> AvaliarTemporada.reviewTemporada(entrada);
            }
        }
    }
}
