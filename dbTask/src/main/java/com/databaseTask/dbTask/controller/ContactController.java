package com.databaseTask.dbTask.controller;

import com.databaseTask.dbTask.entity.Client;
import com.databaseTask.dbTask.entity.Contact;
import com.databaseTask.dbTask.dto.ContactDTO;
import com.databaseTask.dbTask.service.ContactService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ContactDTO addContact(@RequestBody ContactDTO contactDTO, @RequestParam Long clientId) {
        Contact contact = new Contact();
        contact.setType(contactDTO.getType());
        contact.setValue(contactDTO.getValue());
        Client client = new Client();
        client.setId(clientId);
        contact.setClient(client);
        Contact savedContact = contactService.addContact(contact);
        contactDTO.setId(savedContact.getId());
        return contactDTO;
    }

    @GetMapping("/client/{clientId}")
    public List<Contact> getContactsByClientId(@PathVariable Long clientId) {
        return contactService.getContactsByClientId(clientId);
    }

    @GetMapping("/client/{clientId}/{type}")
    public List<Contact> getContactsByClientIdAndType(@PathVariable Long clientId, @PathVariable String type) {
        return contactService.getContactsByClientIdAndType(clientId, type);
    }
}

