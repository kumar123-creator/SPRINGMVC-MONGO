package com.example.SpringMVCMongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMVCMongo.entity.ToDodata;

@Repository
public interface ToDodataRepo extends MongoRepository<ToDodata, Integer>{
	
}