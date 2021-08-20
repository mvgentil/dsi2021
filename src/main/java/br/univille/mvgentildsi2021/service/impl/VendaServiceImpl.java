package br.univille.mvgentildsi2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Venda;
import br.univille.mvgentildsi2021.repository.VendaRepository;
import br.univille.mvgentildsi2021.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService{

  @Autowired
  private VendaRepository repository;

  @Override
  public List<Venda> getAll() {
    return repository.findAll();
  }

  @Override
  public void save(Venda venda) {
    repository.save(venda);
  }

  @Override
  public void delete(Venda venda) {
    repository.delete(venda);
  }
  
}
