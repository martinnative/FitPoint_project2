package com.web.projects.fitpoint.fitpoint.model;

import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainerSex;
import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainerType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class Trainer {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String number;
    private TrainerSex sex;
    private TrainerType type;

    private Gym gym;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
