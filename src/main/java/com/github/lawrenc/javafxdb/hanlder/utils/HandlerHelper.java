package com.github.lawrenc.javafxdb.hanlder.utils;

import com.github.lawrenc.javafxdb.hanlder.DBHandler;
import com.github.lawrenc.javafxdb.hanlder.domain.ConnectInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Lawrence
 * date  2023/9/7 23:05
 */
@Service
public class HandlerHelper {

    @Autowired
    private List<DBHandler> handlers;

    @PostConstruct
    void init() {
            //
    }

    void connect() {
        DBType dbType = DBType.MYSQL;
        DBHandler handler = handlers.stream().filter(h -> h.match(dbType)).findAny().orElseThrow(() -> new RuntimeException("no match handler"));
        handler.connect(new ConnectInfo());
    }

}