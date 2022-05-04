package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long ID;

    @DateTimeFormat
    private LocalDateTime dateTimeFormat;
    @ManyToOne
    private Trainer trainer;
    @ManyToOne
    private FitnessCenter fitnessCenter;

    public Appointment(LocalDateTime dateTimeFormat, Trainer trainer, FitnessCenter fitnessCenter) {
        this.dateTimeFormat = dateTimeFormat;
        this.trainer = trainer;
        this.fitnessCenter = fitnessCenter;
    }

    public Appointment() {
    }
}
