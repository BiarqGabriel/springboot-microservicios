package com.springboot.microservicios.springbootmicroservicios.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservicios.springbootmicroservicios.entities.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{


}
