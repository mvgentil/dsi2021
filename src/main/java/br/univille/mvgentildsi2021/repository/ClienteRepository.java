package br.univille.mvgentildsi2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.mvgentildsi2021.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
  
  List<Cliente> findByNomeContains(String nome);

}
