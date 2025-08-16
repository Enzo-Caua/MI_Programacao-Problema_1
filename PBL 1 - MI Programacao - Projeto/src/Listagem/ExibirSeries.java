package Listagem;

import Busca.BuscarSerie;
import Obras.Acervo;
import Obras.Serie;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibir listas de séries com base em diferentes critérios. */
public class ExibirSeries {

    /**
     * Mostra a lista de séries conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha){
        if (escolha == 1){
            System.out.println("Lista de séries em ordem de crescente de avaliação:\n");
            Listagem.listarSerieTitulo(Acervo.getAcervo().getSeries());

        } else if (escolha == 2){
            System.out.println("Lista de séries em ordem de decrescente de avaliação:\n");
            Listagem.listarSerieReverso(Acervo.getAcervo().getSeries());

        } else if (escolha == 3){
            entrada.nextLine();
            System.out.println("Digite o gênero das séries que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de séries do gênero " + genero + ":\n");
            ArrayList<Serie> lista = BuscarSerie.buscaGenero(genero);
            Listagem.listarSerieTitulo(lista);

        } else if (escolha == 4){
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento das séries que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de séries do ano " + anoLancamento + ":\n");
            ArrayList<Serie> lista = BuscarSerie.buscaAnoLancamento(anoLancamento);
            Listagem.listarSerieTitulo(lista);
        }
    }
}
