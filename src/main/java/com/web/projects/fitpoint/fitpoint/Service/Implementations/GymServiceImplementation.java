package com.web.projects.fitpoint.fitpoint.Service.Implementations;

import com.web.projects.fitpoint.fitpoint.Service.GymService;
import com.web.projects.fitpoint.fitpoint.model.Gym;
import com.web.projects.fitpoint.fitpoint.repository.jpa.GymRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class GymServiceImplementation implements GymService {
    private final GymRepository gymRepository;

    public GymServiceImplementation(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }


    @Override
    public List<Gym> findAll() {
        return gymRepository.findAll();
    }

    @Override
    public Optional<Gym> findById(Long id) {
        return gymRepository.findById(id);
    }

    @Override
    public Optional<Gym> findByName(String name) {
        return gymRepository.findByName(name);
    }

    @Override
    public Optional<Gym> save() {
        return Optional.empty();
    }

    @Override
    public Optional<Gym> edit() {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        gymRepository.deleteById(id);

    }
}
