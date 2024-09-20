package com.databaseTask.dbTask.service;

import com.databaseTask.dbTask.entity.Contact;
import com.databaseTask.dbTask.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public List<Contact> getContactsByClientId(Long clientId) {
        return contactRepository.findByClientId(clientId);
    }

    public List<Contact> getContactsByClientIdAndType(Long clientId, String type) {return contactRepository.findByClientIdAndType(clientId, type);}
}
