package com.web.projects.fitpoint.fitpoint.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
@Data
public class Spa {
    private int duration;
    private Date date;
}
