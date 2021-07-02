package br.univille.mvgentildsi2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Cliente;
import br.univille.mvgentildsi2021.repository.ClienteRepository;
import br.univille.mvgentildsi2021.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

  @Autowired
  private ClienteRepository repository;

  @Override
  public List<Cliente> getAll() {
    return repository.findAll();
  }

  @Override
  public void save(Cliente cliente) {
    repository.save(cliente);
  }

  @Override
  public void delete(Cliente cliente) {
    repository.delete(cliente);
  }
  
}
