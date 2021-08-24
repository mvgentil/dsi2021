package br.univille.mvgentildsi2021.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Cliente;

@Service
public interface ClienteService {
  
  
  public List<Cliente> getAll();
  public void save(Cliente cliente);
  public void delete(Cliente cliente);

}
