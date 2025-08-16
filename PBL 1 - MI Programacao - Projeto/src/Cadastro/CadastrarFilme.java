package Cadastro;

import Obras.Acervo;
import Obras.Filme;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por cadastrar filmes no acervo. */
public class CadastrarFilme {

    /**
     * Solicita os dados do filme ao usuário e o adiciona ao acervo.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosFilme(Scanner entrada) {

        System.out.println("Digite os dados solicitados a seguir:");

        entrada.nextLine();

        System.out.println("Título do filme:");
        String titulo = entrada.nextLine();

        System.out.println("Título original do filme:");
        String tituloOriginal = entrada.nextLine();

        System.out.println("Gênero do filme:");
        String genero = entrada.nextLine();

        System.out.println("Ano de lançamento do filme:");
        String anoLancamento = entrada.nextLine();

        System.out.println("Duração do filme (em minutos):");
        int duracao = entrada.nextInt();

        System.out.println("Número de diretores:");
        int num = entrada.nextInt();
        ArrayList<String> diretores = new ArrayList<>();

        entrada.nextLine();

        for (int i = 1; i <= num; i++){
            System.out.println("Digite o nome do(a) diretor(a) " + i + ":");
            String nome = entrada.nextLine();
            diretores.add(nome);
        }

        System.out.println("Número de roteiristas:");
        num = entrada.nextInt();
        ArrayList<String> roteiristas = new ArrayList<>();

        entrada.nextLine();

        for (int i = 1; i <= num; i++){
            System.out.println("Digite o nome do(a) roteirista " + i + ":");
            String nome = entrada.nextLine();
            roteiristas.add(nome);
        }

        System.out.println("Número de atores no elenco:");
        num = entrada.nextInt();
        ArrayList<String> atores = new ArrayList<>();

        entrada.nextLine();

        for (int i = 1; i <= num; i++){
            System.out.println("Digite o nome do ator " + i + ":");
            String nome = entrada.nextLine();
            atores.add(nome);
        }

        System.out.println("Plataforma em que o filme está disponível:");
        String plataforma = entrada.nextLine();

        Filme filme = new Filme(titulo, tituloOriginal, genero, anoLancamento,
                duracao, diretores, roteiristas, atores, plataforma);
        Acervo.getAcervo().addFilme(filme);

        System.out.println("O filme " + titulo + " foi cadastrado com sucesso!\n");
        System.out.println(filme.toString());
    }
}
