package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
@Data
public class Gym {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private List<Member> members;

    public Gym(Long id, String name, List<Member> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public Gym() {
    }
}
