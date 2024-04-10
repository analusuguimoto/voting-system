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
}
