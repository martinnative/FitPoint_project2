package com.web.projects.fitpoint.fitpoint.model;

import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainingType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class Training {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String duration;
    private Date date;
    private TrainingType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
