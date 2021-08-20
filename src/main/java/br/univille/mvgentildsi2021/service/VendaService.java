package br.univille.mvgentildsi2021.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Venda;

@Service
public interface VendaService {
  public List<Venda> getAll();
  public void save(Venda venda);
  public void delete(Venda venda);
}
