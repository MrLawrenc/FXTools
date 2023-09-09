package com.github.lawrenc.javafxdb.hanlder.domain;

import lombok.Data;

/**
 * @author : Lawrence
 * date  2023/9/7 23:01
 */
@Data
public class ConnectResult {
    private boolean connected;
    private String msg;
}