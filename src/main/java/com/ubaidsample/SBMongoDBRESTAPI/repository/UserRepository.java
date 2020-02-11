package com.ubaidsample.SBMongoDBRESTAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ubaidsample.SBMongoDBRESTAPI.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
