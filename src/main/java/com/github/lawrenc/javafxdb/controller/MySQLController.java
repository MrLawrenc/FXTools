package com.github.lawrenc.javafxdb.controller;

import com.github.lawrenc.javafxdb.domain.BasUser;
import com.github.lawrenc.javafxdb.mapper.BasUserMapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * MySQL 控制器
 *
 * @author : Lawrence
 */
@Slf4j
@Getter
@Component
public class MySQLController implements Initializable, DisposableBean {

    @FXML
    private TextField addr;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @Autowired
    private BasUserMapper basUserMapper;

    public MySQLController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void destroy() throws Exception {

    }


    public void connMysql(MouseEvent event) {
        String addrStr = addr.getText();
        String usernameStr = username.getText();
        String passwordStr = password.getText();
        Assert.notNull(addrStr, "addr should be provided.");
        Assert.notNull(usernameStr, "username should be provided.");
        Assert.notNull(passwordStr, "password should be provided.");
        Assert.isTrue(addrStr.contains("@"), "addr should @");
        String[] addrArray = addrStr.split("@");
        String ip = addrArray[0];
        //should be number
        int port = Integer.parseInt(addrArray[1]);
        Assert.isTrue(port > 1000 && port < 20000, "addr should @");
        log.debug("username: {}, password: {}, addr: {}", usernameStr, passwordStr, addrStr);
        BasUser basUser = new BasUser();
        basUser.setId(321321321312l);
        basUser.setName("dsadas");
        basUserMapper.insert(basUser);
        BasUser user = basUserMapper.selectById(321321321312l);
        System.out.println(user);
    }
}