package com.supergroup.reddot.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Comment {

    private Long id;
    private String body;

    //link
}
