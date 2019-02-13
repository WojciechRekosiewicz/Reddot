package com.supergroup.reddot.model;

import lombok.Data;

import javax.persistence.Entity;


@Entity
@Data
public class Vote {

    private Long id;
    private int vote;


    //user
    //link
}
