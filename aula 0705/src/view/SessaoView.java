package view;

import controller.SessaoController;

import java.util.Scanner;

public class SessaoView {

    private Scanner scanner;
    private SessaoController controller;

    public SessaoView() {
        scanner = new Scanner(System.in);
        controller = new SessaoController();
    }

    public void menu() {

        int opcao;

        do {
            System.out.println("\n===== SISTEMA CINEMA =====");
            System.out.println("1 - Cadastrar Sessão");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarSessao();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void cadastrarSessao() {

        System.out.print("Data: ");
        String data = scanner.nextLine();

        System.out.print("Horário: ");
        String horario = scanner.nextLine();

        System.out.print("Público: ");
        int publico = scanner.nextInt();

        System.out.print("ID Cinema: ");
        int idCinema = scanner.nextInt();

        System.out.print("ID Filme: ");
        int idFilme = scanner.nextInt();

        scanner.nextLine();

        controller.cadastrarSessao(
                data,
                horario,
                publico,
                idCinema,
                idFilme
        );
    }
}