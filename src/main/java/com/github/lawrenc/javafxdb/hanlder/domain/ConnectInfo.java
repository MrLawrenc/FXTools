package com.github.lawrenc.javafxdb.hanlder.domain;

import lombok.Data;

/**
 * @author : Lawrence
 * date  2023/9/7 22:54
 */
@Data
public class ConnectInfo {
    private String ip;
    private String port;
    private String username;
    private String password;
}