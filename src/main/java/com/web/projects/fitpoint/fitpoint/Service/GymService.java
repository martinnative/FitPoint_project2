package com.web.projects.fitpoint.fitpoint.Service;


import com.web.projects.fitpoint.fitpoint.model.Gym;

import java.util.List;
import java.util.Optional;

public interface GymService{

    List<Gym> findAll();

    Optional<Gym> findById(Long id);

    Optional<Gym> findByName(String name);

    Optional<Gym> save();

    Optional<Gym> edit();

    void deleteById(Long id);
}
