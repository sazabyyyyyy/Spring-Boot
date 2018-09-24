package com.kaneko.springboot.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaneko.springboot.MyDataMongo;

@Repository
public interface MyDataMongoRepository
     extends MongoRepository<MyDataMongo, Long> {
	public List<MyDataMongo> findByName(String s);

}
