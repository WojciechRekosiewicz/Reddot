package com.supergroup.reddot.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Link {

    //represent table in db

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;


}
