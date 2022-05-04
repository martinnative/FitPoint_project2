package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class SpaAndRelax<FitnessCenter> {
        private FitnessCenter fitnessCenter;
}
