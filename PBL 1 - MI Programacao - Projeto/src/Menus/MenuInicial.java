package Menus;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu principal do sistema "Diário Cultural".
 * Através deste menu, o usuário pode navegar entre as opções de cadastro, atualização,
 * avaliação, busca, listagem ou encerrar o programa.
 */
public class MenuInicial {

    /**
     * Exibe o menu principal do sistema e direciona para a funcionalidade correspondente
     * com base na escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Opções do seu Diário Cultural:\n");
            System.out.println("[1] - Cadastrar obras");
            System.out.println("[2] - Atualizar dados");
            System.out.println("[3] - Avaliar obras");
            System.out.println("[4] - Buscar obras");
            System.out.println("[5] - Listar obras");
            System.out.println("[6] - Fechar diário\n");
            System.out.print("Digite o número da opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> MenuCadastro.mostrarMenu(entrada);
                case 2 -> MenuAtualizacao.mostrarMenu(entrada);
                case 3 -> MenuAvaliacao.mostrarMenu(entrada);
                case 4 -> MenuBusca.mostrarMenu(entrada);
                case 5 -> MenuListas.mostrarMenu(entrada);
                // caso 6 encerra o menu principal e termina o loop
            }
        }
    }
}
