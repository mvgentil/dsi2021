package br.univille.mvgentildsi2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.mvgentildsi2021.model.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
  
  List<Vendedor> findByNomeContains(String nome);
}
