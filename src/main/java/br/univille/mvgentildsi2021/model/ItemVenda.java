package br.univille.mvgentildsi2021.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int qtdVenda;
  @ManyToOne
  private Produto produto;
  
  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQtdVenda() {
    return qtdVenda;
  }

  public void setQtdVenda(int qtdVenda) {
    this.qtdVenda = qtdVenda;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


}
