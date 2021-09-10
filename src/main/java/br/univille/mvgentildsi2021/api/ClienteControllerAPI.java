package br.univille.mvgentildsi2021.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.mvgentildsi2021.model.Cliente;
import br.univille.mvgentildsi2021.service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteControllerAPI {
  
  @Autowired
  private ClienteService service;

  @GetMapping
  public ResponseEntity<List<Cliente>> getAll(){
    return new ResponseEntity<List<Cliente>>(service.getAll(), HttpStatus.OK);
  }

}
