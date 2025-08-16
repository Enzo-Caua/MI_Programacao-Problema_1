package Menus;

import Busca.BuscarFilme;
import Busca.BuscarLivro;
import Busca.BuscarSerie;
import Cadastro.CadastrarTemporada;
import Obras.Filme;
import Obras.Livro;
import Obras.Serie;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu de atualizações de dados relacionados às obras no sistema.
 * Permite atualizar status de leitura/visualização, disponibilidade e cadastrar temporadas.
 */
public class MenuAtualizacao {

    /**
     * Exibe o menu de opções de atualização e executa a ação correspondente com base na entrada do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\nOpções de atualizações: ");
            System.out.println("[1] - Atualizar leitura de um livro");
            System.out.println("[2] - Atualizar visualização de um filme");
            System.out.println("[3] - Atualizar visualização de uma série");
            System.out.println("[4] - Atualizar disponibilidade de um livro");
            System.out.println("[5] - Atualizar temporadas de uma série");
            System.out.println("[6] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de atualização que deseja fazer: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    entrada.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = entrada.nextLine();
                    Livro livro = BuscarLivro.buscaTitulo(titulo).getFirst();
                    System.out.print("Digite a data em que " + titulo + " foi lido: ");
                    String dataVisto = entrada.nextLine();
                    livro.alterarVisto(dataVisto);
                    System.out.println("Atualização feita com sucesso!");
                }
                case 2 -> {
                    entrada.nextLine();
                    System.out.print("Digite o título do filme: ");
                    String titulo = entrada.nextLine();
                    Filme filme = BuscarFilme.buscaTitulo(titulo).getFirst();
                    System.out.print("Digite a data em que " + titulo + " foi visto: ");
                    String dataVisto = entrada.nextLine();
                    filme.alterarVisto(dataVisto);
                    System.out.println("Atualização feita com sucesso!");
                }
                case 3 -> {
                    entrada.nextLine();
                    System.out.print("Digite o título da série: ");
                    String titulo = entrada.nextLine();
                    Serie serie = BuscarSerie.buscaTitulo(titulo).getFirst();
                    System.out.print("Digite a data em que " + titulo + " foi vista: ");
                    String dataVisto = entrada.nextLine();
                    serie.alterarVisto(dataVisto);
                    System.out.println("Atualização feita com sucesso!");
                }
                case 4 -> {
                    entrada.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = entrada.nextLine();
                    Livro livro = BuscarLivro.buscaTitulo(titulo).getFirst();
                    System.out.println("O livro " + livro.getTitulo() +
                            " está: " + (livro.isDisponivel() ? "Disponível" : "Indisponível"));
                    System.out.print("Deseja alterar disponibilidade do livro? ");
                    String resposta = entrada.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        livro.alterarDisponivel();
                        System.out.println("Atualização feita com sucesso!");
                    } else {
                        System.out.println("Disponibilidade não foi alterada!");
                    }
                }
                case 5 -> {
                    entrada.nextLine();
                    System.out.print("Digite o título da série: ");
                    String titulo = entrada.nextLine();
                    Serie serie = BuscarSerie.buscaTitulo(titulo).getFirst();
                    System.out.print("Digite o número de temporadas a serem cadastradas: ");
                    int num = entrada.nextInt();
                    for (int i = 1; i <= num; i++) {
                        CadastrarTemporada.dadosTemporada(serie, entrada);
                    }
                    System.out.println("Atualização feita com sucesso!");
                }
            }
        }
    }
}
