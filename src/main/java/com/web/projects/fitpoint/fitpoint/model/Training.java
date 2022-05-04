package com.web.projects.fitpoint.fitpoint.model;

import com.web.projects.fitpoint.fitpoint.model.enumerations.TrainingType;
import lombok.Data;

import java.util.Date;
@Data
public class Training {
    private String duration;
    private Date date;
    private TrainingType type;

}
