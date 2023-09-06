package com.github.lawrenc.javafxdb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BasUser implements Serializable {
    private Long id;
    private String name;
    private Integer userAge;
    private String email;
    private Date birthday;
 
// getter、setter 方法.
}