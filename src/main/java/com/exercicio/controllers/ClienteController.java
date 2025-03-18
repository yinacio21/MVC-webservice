package com.exercicio.controllers;
import com.exercicio.entities.ClienteEntity;
import com.exercicio.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {


    @Autowired
    public ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<ClienteEntity>> listarClientes(){
        try{
        List<ClienteEntity> clienteRetorno = clienteService.listarClientes();
        return ResponseEntity.ok().body(clienteRetorno);
    } catch (RuntimeException e){
            return  ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("/novo")
    public ResponseEntity<ClienteEntity> novoCLiente(@RequestBody ClienteEntity cliente){
        try{

        ClienteEntity clienteRetorno = clienteService.cadastrarCliente(cliente);
        return ResponseEntity.ok().body(clienteRetorno);
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<ClienteEntity> editarCliente (
            @PathVariable Long id,
            @RequestBody ClienteEntity cliente
    ){
        try{
            ClienteEntity clienteRetorno = clienteService.atualizarCliente(id, cliente);
            return ResponseEntity.ok().body(clienteRetorno);
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<ClienteEntity> excluirCliente(
            @PathVariable Long id
    ){
        try{
            clienteService.excluirCliente(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }

}
