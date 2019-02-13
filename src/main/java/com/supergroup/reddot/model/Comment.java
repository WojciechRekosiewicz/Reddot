package com.supergroup.reddot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Comment {


    @Id
    @GeneratedValue
    private Long id;
    private String body;

    //link
}
