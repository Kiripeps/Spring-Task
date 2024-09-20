package com.databaseTask.dbTask.controller;

import com.databaseTask.dbTask.entity.Client;
import com.databaseTask.dbTask.dto.ClientDTO;
import com.databaseTask.dbTask.service.ClientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ClientDTO addClient(@RequestBody ClientDTO clientDTO) {
        Client client = new Client();
        client.setName(clientDTO.getName());
        Client savedClient = clientService.addClient(client);
        clientDTO.setId(savedClient.getId());
        return clientDTO;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
}

