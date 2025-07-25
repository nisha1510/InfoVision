package com.demo.MongoDBExample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.MongoDBExample.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {
}