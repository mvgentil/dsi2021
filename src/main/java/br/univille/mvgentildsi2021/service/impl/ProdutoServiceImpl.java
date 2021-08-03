package br.univille.mvgentildsi2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Produto;
import br.univille.mvgentildsi2021.repository.ProdutoRepository;
import br.univille.mvgentildsi2021.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

  @Autowired
  private ProdutoRepository repository;

  @Override
  public List<Produto> getAll() {
    return repository.findAll();
  }

  @Override
  public void save(Produto produto) {
    repository.save(produto);
  }

  @Override
  public void delete(Produto produto) {
    repository.delete(produto);
  }
  
  
}
