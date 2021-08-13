package br.univille.mvgentildsi2021.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date data;
  private float valorTotal;

  @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
  private Vendedor vendedor;

  @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
  private Cliente cliente;

  @OneToMany
  @JoinColumn(name="venda_id")
  private List<ItemVenda> listaItens = new ArrayList<ItemVenda>();

  public Vendedor getVendedor() {
    return vendedor;
  }
  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }
  public Cliente getCliente() {
    return cliente;
  }
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }
  public float getValorTotal() {
    return valorTotal;
  }
  public void setValor(float valorTotal) {
    this.valorTotal = valorTotal;
  }

  public void addItem(ItemVenda item){
    listaItens.add(item);
    valorTotal += item.getPrecoVenda() * item.getQtdVenda();
    item.setQtdEstoque(item.getQtdEstoque()-item.getQtdVenda());
  }

  public void finalizarVenda(){
    cliente.setScore(cliente.getScore()+10);
  }

  
}
