package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Gym {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(fetch= FetchType.EAGER)
    private List<Member> members;

    @ManyToOne
    private Trainer trainerName;

    public Gym(Long id, String name, List<Member> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }


}
