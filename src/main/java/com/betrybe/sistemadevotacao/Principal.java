package com.betrybe.sistemadevotacao;

import java.util.Objects;
import java.util.Scanner;

/**
 * implementing class Principal.
 */
public class Principal {
  /**
   * methods of class Principal.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      String numeroDaOpcao = scanner.nextLine();

      if (Objects.equals(numeroDaOpcao, "2")) {
        break;
      }

      System.out.println("Entre com o nome da pessoa candidata: ");
      String cddNome = scanner.nextLine();
      System.out.println("Entre com o número da pessoa candidata: ");
      String cddNumero = scanner.nextLine();
      gerenciamentoVotacao.cadastrarPessoaCandidata(cddNome, Integer.parseInt(cddNumero));
    }

    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      String numerodaOpcao = scanner.nextLine();

      if (Objects.equals(numerodaOpcao, "2")) {
        break;
      }

      System.out.println("Entre com o nome da pessoa eleitora: ");
      String eleiNome = scanner.nextLine();
      System.out.println("Entre com o CPF da pessoa eleitora: ");
      String eleiCpf = scanner.nextLine();
      gerenciamentoVotacao.cadastrarPessoaEleitora(eleiNome, eleiCpf);
    }

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      String numeroDaOpcao = scanner.nextLine();

      if (Objects.equals(numeroDaOpcao, "1")) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String eleiCpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String cddNumero = scanner.nextLine();
        gerenciamentoVotacao.votar(eleiCpf, Integer.parseInt(cddNumero));
      }

      if (Objects.equals(numeroDaOpcao, "2")) {
        gerenciamentoVotacao.mostrarResultado();
      }

      if (Objects.equals(numeroDaOpcao, "3")) {
        gerenciamentoVotacao.mostrarResultado();
        break;
      }
    }
  }
}
