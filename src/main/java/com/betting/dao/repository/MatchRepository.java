package com.betting.dao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.betting.dao.entity.MatchEntity;

@Repository
public class MatchRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public void insertMatch(MatchEntity matchEntity) {
		mongoTemplate.insert(matchEntity);
	}
	
	public void createMatchCollection() {
        if (!mongoTemplate.collectionExists(MatchEntity.class)) {
            mongoTemplate.createCollection(MatchEntity.class);
        }
    }

    public void dropMatchCollection() {
        if (mongoTemplate.collectionExists(MatchEntity.class)) {
            mongoTemplate.dropCollection(MatchEntity.class);
        }
    }

}
