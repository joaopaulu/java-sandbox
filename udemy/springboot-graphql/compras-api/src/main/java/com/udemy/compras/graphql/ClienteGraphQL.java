package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.model.Cliente;
import com.udemy.compras.model.ClienteInput;
import com.udemy.compras.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ClienteService clienteService;

    public Cliente cliente(Long id){
        return clienteService.findById(id);
    }

    public List<Cliente> clientes(){
        return clienteService.findAll();
    }

    public Cliente saveCliente(ClienteInput input){
        ModelMapper model = new ModelMapper();
        Cliente cliente = model.map(input, Cliente.class);

        return clienteService.save(cliente);
    }

    public Boolean deleteCleinte(Long id){
        return clienteService.deleteById(id);
    }
}
