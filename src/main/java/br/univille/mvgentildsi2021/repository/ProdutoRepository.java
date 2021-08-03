package br.univille.mvgentildsi2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.mvgentildsi2021.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  
  List<Produto> findByDescricaoContains(String descricao);
}
