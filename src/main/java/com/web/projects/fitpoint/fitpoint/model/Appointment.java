package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class Appointment {

    @Id
    @GeneratedValue
    private Long ID;
    private DateTimeFormat dateTimeFormat;
    private Trainer trainer;
    private FitnessCenter fitnessCenter;

    public Appointment(DateTimeFormat dateTimeFormat, Trainer trainer, FitnessCenter fitnessCenter) {
        this.dateTimeFormat = dateTimeFormat;
        this.trainer = trainer;
        this.fitnessCenter = fitnessCenter;
    }

    public Appointment() {
    }
}
