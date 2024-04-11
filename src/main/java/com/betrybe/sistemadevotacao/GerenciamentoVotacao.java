package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * implementing class GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : this.pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }
    PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(novaPessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : this.pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
    PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(novaPessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : this.cpfsComputados) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
      }
    }

    for (PessoaCandidata candidata : this.pessoasCandidatas) {
      if (candidata.getNumero() == numeroPessoaCandidata) {
        candidata.receberVoto();
      }
    }

    this.cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    if (this.cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }

    for (PessoaCandidata candidata : this.pessoasCandidatas) {
      String nome = candidata.getNome();
      int votos = candidata.getVotos();
      float percentage = (float) candidata.getVotos() / this.cpfsComputados.size();
      int mathRoundPercentage = Math.round(percentage * 100);
      System.out.println("Nome: " + nome + " - " + votos + " votos ( "
              + mathRoundPercentage + "% )");
    }

    System.out.println("Total de votos: " + this.cpfsComputados.size());
  }
}
