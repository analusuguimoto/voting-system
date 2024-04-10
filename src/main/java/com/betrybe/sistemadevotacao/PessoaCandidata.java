package com.betrybe.sistemadevotacao;


/**
 * implementing class PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {
  /**
   * methods and attributes of PessoaCandidata.
   */
  private int numero;
  private int votos;

  /**
   * constructor PessoaCandidata.
   */
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getVotos() {
    return votos;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void receberVoto() {
    this.votos++;
  }
}
