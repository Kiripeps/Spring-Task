package com.databaseTask.dbTask.repository;

import com.databaseTask.dbTask.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
