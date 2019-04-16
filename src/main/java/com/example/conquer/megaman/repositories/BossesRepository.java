package com.example.conquer.megaman.repositories;

import com.example.conquer.megaman.models.Bosses;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BossesRepository extends MongoRepository<Bosses, String> {
        Bosses findBy_id(ObjectId _id);
}
