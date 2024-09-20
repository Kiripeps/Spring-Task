package com.databaseTask.dbTask.repository;

import com.databaseTask.dbTask.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByClientId(Long clientId);
    List<Contact> findByClientIdAndType(Long clientId, String type);
}
