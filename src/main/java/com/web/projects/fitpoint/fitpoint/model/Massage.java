package com.web.projects.fitpoint.fitpoint.model;

import com.web.projects.fitpoint.fitpoint.model.enumerations.MassageType;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
@Data
@Entity
public class Massage {

    private int duration;
    private Date date;
    private MassageType type;

}
