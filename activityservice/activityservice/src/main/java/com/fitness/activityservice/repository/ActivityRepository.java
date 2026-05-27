package com.fitness.activityservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.fitness.activityservice.model.Activity;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

    List<Activity> findByUserId(String userId);
}
