package com.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.model.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Long>{

}
