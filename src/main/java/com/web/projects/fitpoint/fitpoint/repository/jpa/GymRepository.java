package com.web.projects.fitpoint.fitpoint.repository.jpa;

import com.web.projects.fitpoint.fitpoint.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
    @Override
    List<Gym> findAll();

    Optional<Gym> findByName(String name);

}
