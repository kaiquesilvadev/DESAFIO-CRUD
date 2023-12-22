package com.kaique.DesafioCrud.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.DesafioCrud.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
