package br.univille.mvgentildsi2021.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Vendedor;

@Service
public interface VendedorService {
  
  public List<Vendedor> getAll();
  public void save(Vendedor vendedor);
  public void delete(Vendedor vendedor);

}
