package com.web.projects.fitpoint.fitpoint.service;


import com.web.projects.fitpoint.fitpoint.model.Gym;
import com.web.projects.fitpoint.fitpoint.model.Member;
import com.web.projects.fitpoint.fitpoint.model.Trainer;

import java.util.List;

public interface GymService{

    List<Gym> findAll();

    Gym findById(Long id);

    Gym findByName(String name);

    Gym save(Long id);

    Gym edit(Long id, String name, List<Member> members, Trainer trainer);

    void deleteById(Long id);
}
