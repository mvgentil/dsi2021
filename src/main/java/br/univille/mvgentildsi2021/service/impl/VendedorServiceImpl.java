package br.univille.mvgentildsi2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mvgentildsi2021.model.Vendedor;
import br.univille.mvgentildsi2021.repository.VendedorRepository;
import br.univille.mvgentildsi2021.service.VendedorService;

@Service
public class VendedorServiceImpl implements VendedorService{

    @Autowired
    private VendedorRepository repository;

    @Override
    public List<Vendedor> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Vendedor vendedor) {
        repository.save(vendedor);
    }

    @Override
    public void delete(Vendedor vendedor) {
        repository.delete(vendedor);
    }
    
}
