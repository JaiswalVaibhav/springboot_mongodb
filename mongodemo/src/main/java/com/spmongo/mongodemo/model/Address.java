package com.spmongo.mongodemo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String street;
    private String area;
    private Integer pincode;
}

