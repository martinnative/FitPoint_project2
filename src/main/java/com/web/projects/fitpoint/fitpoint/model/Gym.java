package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
public class Gym {

    private Long id;
    private String name;
    private List<Member> members;

    private Trainer trainerName;

    public Gym(Long id, String name, List<Member> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }


}
