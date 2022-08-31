package org.vendas.service;

import org.springframework.stereotype.Service;
import org.vendas.model.Cliente;
import org.vendas.repository.ClienteRepository;

@Service
public class ClienteService {

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplica validações

    }
}
