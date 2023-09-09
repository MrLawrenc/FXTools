package com.github.lawrenc.javafxdb.hanlder.utils;

import lombok.Getter;

@Getter
public enum DBType {
    MYSQL("MYSQL"), MONGO("MONGO");
    private String type;


    DBType(String type) {
        this.type = type;
    }

}
