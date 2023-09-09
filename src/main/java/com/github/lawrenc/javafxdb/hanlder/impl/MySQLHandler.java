package com.github.lawrenc.javafxdb.hanlder.impl;

import com.github.lawrenc.javafxdb.hanlder.DBHandler;
import com.github.lawrenc.javafxdb.hanlder.domain.Command;
import com.github.lawrenc.javafxdb.hanlder.domain.CommandExecResult;
import com.github.lawrenc.javafxdb.hanlder.domain.ConnectInfo;
import com.github.lawrenc.javafxdb.hanlder.domain.ConnectResult;
import com.github.lawrenc.javafxdb.hanlder.utils.DBType;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * MYSQL处理器你
 *
 * @author : Lawrence
 * date  2023/9/7 20:31
 */
@Component
public class MySQLHandler implements DBHandler {

    @Override
    public boolean match(DBType type) {
        return Objects.equals(type, DBType.MYSQL);
    }


    public ConnectResult connect(ConnectInfo connectInfo) {
        return null;
    }

    @Override
    public CommandExecResult exec(Command command) {
        return null;
    }


}