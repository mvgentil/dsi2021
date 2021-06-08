package br.univille.mvgentildsi2021.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Vendedor extends Pessoa {
  
  private float salario;
  private float comissao;

  @OneToOne(cascade = CascadeType.ALL)
  private Usuario usuario;

  public Usuario getUsuario() {
    return usuario;
  }
  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
  public float getSalario() {
    return salario;
  }
  public void setSalario(float salario) {
    this.salario = salario;
  }
  public float getComissao() {
    return comissao;
  }
  public void setComissao(float comissao) {
    this.comissao = comissao;
  }

}
