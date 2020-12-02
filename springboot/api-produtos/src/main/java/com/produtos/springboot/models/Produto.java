package com.produtos.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idProduto;
  private String nome;
  private BigDecimal quantidade;
  private BigDecimal valor;

  public long getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(long idProduto) {
    this.idProduto = idProduto;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public BigDecimal getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(BigDecimal quantidade) {
    this.quantidade = quantidade;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

}