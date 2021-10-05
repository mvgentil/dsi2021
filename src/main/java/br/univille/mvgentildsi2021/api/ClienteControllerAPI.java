package br.univille.mvgentildsi2021.api;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.mvgentildsi2021.model.Cliente;
import br.univille.mvgentildsi2021.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteControllerAPI {
  
  @Autowired
  private ClienteService service;

  @GetMapping
  public ResponseEntity<List<Cliente>> getAll(){
    return new ResponseEntity<List<Cliente>>(service.getAll(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente){
    try{
    cliente.setId(0);
    service.save(cliente);
    return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
    }catch (Exception ex){
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<Cliente> getById(@PathVariable("id") Cliente cliente){
      return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Cliente> delete(@PathVariable("id") Cliente cliente){
    service.delete(cliente);
    return new ResponseEntity<>(cliente,HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Cliente> update(@RequestBody Cliente clienteNovo, @PathVariable("id") Cliente clienteAntigo){
    clienteAntigo.setCPF(clienteNovo.getCPF());
    clienteAntigo.setNome(clienteNovo.getNome());
    clienteAntigo.setTelefone(clienteNovo.getTelefone());
    service.save(clienteAntigo);

    return new ResponseEntity<>(clienteAntigo, HttpStatus.OK);
  }
}
