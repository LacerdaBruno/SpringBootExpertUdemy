package org.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vendas.model.Cliente;
import org.vendas.repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository repository;
    @Autowired
    public ClienteService( ClienteRepository repository ){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações

    }
}
