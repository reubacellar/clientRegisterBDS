package com.reuel_dev.clientregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reuel_dev.clientregister.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
