package com.web.projects.fitpoint.fitpoint.service.Implementations;

import com.web.projects.fitpoint.fitpoint.model.Member;
import com.web.projects.fitpoint.fitpoint.model.Trainer;
import com.web.projects.fitpoint.fitpoint.model.exceptions.InvalidGymIdException;
import com.web.projects.fitpoint.fitpoint.model.exceptions.InvalidGymNameException;
import com.web.projects.fitpoint.fitpoint.service.GymService;
import com.web.projects.fitpoint.fitpoint.model.Gym;
import com.web.projects.fitpoint.fitpoint.repository.GymRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Gym findById(Long id) {
        return gymRepository.findById(id).orElseThrow(InvalidGymIdException::new);
    }

    @Override
    public Gym findByName(String name) {
        return gymRepository.findByName(name).orElseThrow(InvalidGymNameException::new);
    }

    @Override
    public Gym save(Long id) {
        Gym gym = gymRepository.findById(id).orElseThrow(InvalidGymIdException::new);
        return gymRepository.save(gym);
    }

    @Override
    public Gym edit(Long id, String name, List<Member> members, Trainer trainer) {
        Gym gym = gymRepository.findById(id).orElseThrow(InvalidGymIdException::new);
        gym.setName(name);
        gym.setMembers(members);
        gym.setTrainerName(trainer);
        gymRepository.save(gym);
        return gym;

    }


    @Override
    public void deleteById(Long id) {
        gymRepository.deleteById(id);

    }
}
