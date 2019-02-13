package com.supergroup.reddot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

    private int vote;


    //user
    //link
}
