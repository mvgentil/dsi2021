package br.univille.mvgentildsi2021.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemVenda extends Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private float precoVenda;
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  public float getPrecoVenda() {
    return precoVenda;
  }
  public void setPrecoVenda(float precoVenda) {
    this.precoVenda = precoVenda;
  }

}
