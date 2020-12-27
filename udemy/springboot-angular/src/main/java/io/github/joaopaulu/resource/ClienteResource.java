package io.github.joaopaulu.resource;

import io.github.joaopaulu.model.Cliente;
import io.github.joaopaulu.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @GetMapping("{id}")
    public Cliente buscarPorId(@PathVariable Integer id){
        return clienteRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        clienteRepository
            .findById(id)
            .map(cliente ->{
                clienteRepository.delete(cliente);
                return Void.TYPE;
            })
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Cliente clienteAtualizado){
        clienteRepository
            .findById(id)
            .map(cliente ->{
                clienteAtualizado.setId(cliente.getId());
                return clienteRepository.save(clienteAtualizado);
            })
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
