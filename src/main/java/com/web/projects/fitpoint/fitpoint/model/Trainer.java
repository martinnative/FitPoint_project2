package com.web.projects.fitpoint.fitpoint.model;

import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainerSex;
import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainerType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Trainer {
    @Id
    private String name;
    private String username;
    private String password;
    private String number;
    private TrainerSex sex;
    private TrainerType type;

    @ManyToMany(fetch = FetchType.EAGER)
    private Gym gymId;

}
