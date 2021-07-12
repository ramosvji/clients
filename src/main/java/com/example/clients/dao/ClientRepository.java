package com.example.clients.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.clients.dao.entities.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {

}
