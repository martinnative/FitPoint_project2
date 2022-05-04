package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String password;
    private int credits;

    @ManyToOne(fetch = FetchType.EAGER)
    private Gym gymId;

    public Member(Long id, String name, String username, String password, int credits, Gym gymId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.credits = credits;
        this.gymId = gymId;
    }
}

