package com.chalabi.EtudeDeCas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chalabi.EtudeDeCas.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
