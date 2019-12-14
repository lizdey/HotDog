package com.example;

import org.springframework.data.repository.CrudRepository;

import com.example.Info;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface InfoRepository extends CrudRepository<Info, Long> {

}