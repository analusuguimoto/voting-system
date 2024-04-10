package com.betrybe.sistemadevotacao;

/**
 * implementing class PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  /**
   * methods and attributes of PessoaEleitora.
   */
  private String cpf;

  /**
   * constructor PessoaEleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
