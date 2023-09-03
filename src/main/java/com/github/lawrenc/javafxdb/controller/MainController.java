package com.github.lawrenc.javafxdb.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : LiuMingyao
 * 2019/12/8 19:55
 * <p>
 * fxml主控制器
 */
@Slf4j
@Getter
@Component

public class MainController implements Initializable, DisposableBean {

    @FXML
    private ChoiceBox<String> connectBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void destroy() throws Exception {

    }


    @FXML
    void connectChose(KeyEvent event) {

    }
}