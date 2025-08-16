package Cadastro;

import Obras.Acervo;
import Obras.Serie;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por cadastrar séries no acervo. */
public class CadastrarSerie {

    /**
     * Solicita os dados da série ao usuário e a adiciona ao acervo.
     * Também permite o cadastro das temporadas da série.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosSerie(Scanner entrada) {

        System.out.println("Digite os dados solicitados a seguir:");
        entrada.nextLine();

        System.out.println("Título da série:");
        String titulo = entrada.nextLine();

        System.out.println("Título original da série:");
        String tituloOriginal = entrada.nextLine();

        System.out.println("Gênero da série:");
        String genero = entrada.nextLine();

        System.out.println("Ano de lançamento da série:");
        String anoLancamento = entrada.nextLine();

        System.out.println("Número de diretores da série:");
        int num = entrada.nextInt();
        ArrayList<String> diretores = new ArrayList<>();
        entrada.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite o nome do(a) diretor(a) " + i + ":");
            String nome = entrada.nextLine();
            diretores.add(nome);
        }

        System.out.println("Número de roteiristas:");
        num = entrada.nextInt();
        ArrayList<String> roteiristas = new ArrayList<>();
        entrada.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite o nome do(a) roteirista " + i + ":");
            String nome = entrada.nextLine();
            roteiristas.add(nome);
        }

        System.out.println("Número de atores no elenco:");
        num = entrada.nextInt();
        ArrayList<String> atores = new ArrayList<>();
        entrada.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite o nome do ator " + i + ":");
            String nome = entrada.nextLine();
            atores.add(nome);
        }

        System.out.println("Plataforma em que a série está disponível:");
        String plataforma = entrada.nextLine();

        Serie serie = new Serie(titulo, tituloOriginal, genero, anoLancamento,
                diretores, roteiristas, atores, plataforma);
        Acervo.getAcervo().addSerie(serie);

        System.out.println("Número de temporadas a serem cadastradas:");
        num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            CadastrarTemporada.dadosTemporada(serie, entrada);
        }

        System.out.println("A série " + titulo + " foi cadastrada com sucesso!\n");
        System.out.println(serie.toString());
    }
}
