package com.test.census_polygon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;

import org.geolatte.geom.Point;

@Data
public class DfwDemo {

    private final String key;
    private final int income;
    private final int population;
    @Column(columnDefinition = "spatialObj")
    private Point spatialObj;

//    public DfwDemo(@JsonProperty("key") String key, @JsonProperty("income") int income,@JsonProperty("population") int population ) {
//        this.key = key;
//        this.income = income;
//        this.population = population;
//    }

}