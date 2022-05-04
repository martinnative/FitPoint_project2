package com.web.projects.fitpoint.fitpoint.repository.jpa;

import com.web.projects.fitpoint.fitpoint.model.FitnessCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessCenterRepository extends JpaRepository<FitnessCenter,Long>{


}
