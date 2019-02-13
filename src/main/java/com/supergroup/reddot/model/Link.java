package com.supergroup.reddot.model;


import lombok.Data;

@Data
public class Link {

    //represent table in db
    private Long id;
    private String title;
    private String url;


}
