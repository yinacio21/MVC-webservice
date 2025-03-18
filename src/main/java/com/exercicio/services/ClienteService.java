package com.exercicio.services;
import com.exercicio.entities.ClienteEntity;
import com.exercicio.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

        public List<ClienteEntity> listarClientes(){
            List<ClienteEntity> clienteRetorno = clienteRepository.findAll();
            if (clienteRetorno.isEmpty()){
                throw new RuntimeException("Nenhum cliente encontrado na base de dados");
            }
            return clienteRetorno;
        }

    public ClienteEntity cadastrarCliente(ClienteEntity cliente){
        ClienteEntity clienteRetorno = clienteRepository.save(cliente);
        return clienteRetorno;
    }

    public ClienteEntity atualizarCliente(Long id, ClienteEntity cliente){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não localizado na base de dados");
        }
        cliente.setId(id);
        ClienteEntity clienteRetorno = clienteRepository.save(cliente);
        return clienteRetorno;
    }

    public void excluirCliente(Long id){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não localizado na base de dados");
        }
        clienteRepository.deleteById(id);
    }




}
