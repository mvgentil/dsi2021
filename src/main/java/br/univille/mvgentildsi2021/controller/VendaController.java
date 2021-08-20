package br.univille.mvgentildsi2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.mvgentildsi2021.model.Cliente;
import br.univille.mvgentildsi2021.model.Produto;
import br.univille.mvgentildsi2021.model.Venda;
import br.univille.mvgentildsi2021.model.Vendedor;
import br.univille.mvgentildsi2021.service.ClienteService;
import br.univille.mvgentildsi2021.service.ProdutoService;
import br.univille.mvgentildsi2021.service.VendaService;
import br.univille.mvgentildsi2021.service.VendedorService;

@Controller
@RequestMapping("/venda")
public class VendaController {

  @Autowired
  private VendedorService vendedor;
  @Autowired
  private ClienteService cliente;
  @Autowired
  private ProdutoService produto;
  @Autowired
  private VendaService service;

  @GetMapping
  public ModelAndView index(){
    List<Venda> listaVendas = service.getAll();
    return new ModelAndView("venda/index", "listaVendas", listaVendas);
  }

  @GetMapping("/novo")
  public ModelAndView novo(@ModelAttribute Venda venda){
    List<Vendedor> listaVendedores = vendedor.getAll();
    List<Cliente> listaClientes = cliente.getAll();
    List<Produto> listaProdutos = produto.getAll();
    return new ModelAndView("venda/form", "listaVendedores", listaVendedores);
  } //corrigir este metodo, fazer a tela de nova venda mostrar lista de vendedores, lista de clientes e lista de produtos
    //ao fechar uma venda, o score do cliente deve aumentar 10 pontos, o estoque do produto deve diminuir

  @PostMapping(params = "form")
  public ModelAndView save(Venda venda){
    service.save(venda);
    return new ModelAndView("redirect:/venda");
  }

  @GetMapping("/alterar/{id}")
  public ModelAndView alterar(@PathVariable("id") Venda venda){
    return new ModelAndView("/venda/form","venda",venda);
  }

  @GetMapping("/delete/{id}")
  public ModelAndView delete(@PathVariable("id") Venda venda){
    service.delete(venda);
    return new ModelAndView("redirect:/venda");
  }
  
}
