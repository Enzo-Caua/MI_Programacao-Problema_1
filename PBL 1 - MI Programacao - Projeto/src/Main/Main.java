package Main;

import Menus.MenuInicial;
import Obras.Acervo;

import java.util.Scanner;

/**
 * Classe principal que inicia o sistema de gerenciamento de obras.
 * Responsável por inicializar o acervo e chamar o menu principal de interação com o usuário.
 */
public class Main {

    /**
     * Método principal que executa a aplicação.
     *
     * @param args argumentos de linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        // Obtém a instância única do acervo (Singleton)
        Acervo acervo = Acervo.getAcervo();

        // Scanner para capturar entradas do usuário
        Scanner entrada = new Scanner(System.in);

        // Inicia o menu principal do sistema
        MenuInicial.mostrarMenu(entrada);
    }
}
