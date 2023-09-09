package com.github.lawrenc.javafxdb.hanlder;

import com.github.lawrenc.javafxdb.hanlder.domain.Command;
import com.github.lawrenc.javafxdb.hanlder.domain.CommandExecResult;
import com.github.lawrenc.javafxdb.hanlder.domain.ConnectInfo;
import com.github.lawrenc.javafxdb.hanlder.domain.ConnectResult;
import com.github.lawrenc.javafxdb.hanlder.utils.DBType;

public interface DBHandler {

    boolean match(DBType type);

    ConnectResult connect(ConnectInfo connectInfo);

    CommandExecResult exec(Command command);

    //todo close connect
}
