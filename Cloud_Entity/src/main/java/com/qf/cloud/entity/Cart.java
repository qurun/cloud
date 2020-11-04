package com.qf.cloud.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cart {
    private Integer id;
    private Integer uid;
    private Integer skuid;
    private Integer scount;
    private Integer jprice;
    private Date ctime;
}
