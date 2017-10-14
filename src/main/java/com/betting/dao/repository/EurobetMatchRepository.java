package com.betting.dao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.betting.dao.entity.EurobetMatchEntity;

@Repository
public class EurobetMatchRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public void insertMatch(EurobetMatchEntity matchEntity) {
		mongoTemplate.insert(matchEntity);
	}
	
	public void createMatchCollection() {
        if (!mongoTemplate.collectionExists(EurobetMatchEntity.class)) {
            mongoTemplate.createCollection(EurobetMatchEntity.class);
        }
    }

    public void dropMatchCollection() {
        if (mongoTemplate.collectionExists(EurobetMatchEntity.class)) {
            mongoTemplate.dropCollection(EurobetMatchEntity.class);
        }
    }

}
