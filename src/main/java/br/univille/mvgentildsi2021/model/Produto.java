package br.univille.mvgentildsi2021.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String codigo;
  private float precoFornecedor;
  private String descricao;
  private int qtdEstoque;

  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public float getPrecoFornecedor() {
    return precoFornecedor;
  }
  public void setPrecoFornecedor(float precoFornecedor) {
    this.precoFornecedor = precoFornecedor;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public int getQtdEstoque() {
    return qtdEstoque;
  }
  public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  
}
