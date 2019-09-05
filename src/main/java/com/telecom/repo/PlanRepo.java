package com.telecom.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.telecom.model.Plan;

@Repository
public interface PlanRepo extends MongoRepository<Plan, String>{

}
