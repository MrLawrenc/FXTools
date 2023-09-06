package com.github.lawrenc.javafxdb.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BasUser implements Serializable {
    private Long id;
    private String name;
    private Integer userAge;
    private String email;
    private Date birthday;
 
// getter、setter 方法.
}