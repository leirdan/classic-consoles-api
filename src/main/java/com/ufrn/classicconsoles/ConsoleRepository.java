package com.ufrn.classicconsoles;

import org.springframework.data.mongodb.repository.MongoRepository;

// you need to tell mongorepository interface the type of the data and the type of the id (String)
public interface ConsoleRepository extends MongoRepository<Console, String> {

}
