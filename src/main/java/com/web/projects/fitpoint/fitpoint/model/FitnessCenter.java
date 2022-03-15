package com.web.projects.fitpoint.fitpoint.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
//@Entity
public class FitnessCenter {

    //@Id

    private String name;
    private String city;
    private String location;


}