package com.github.lawrenc.javafxdb;

import com.TestA;
import com.github.lawrenc.javafxdb.boothelp.JfxApplication;
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Lawrence
 * date  2021/12/21 22:42
 */
@SpringBootApplication
@MapperScan("com.github.lawrenc.javafxdb.mapper")
public class JavaFXDBApplication {

    public static void main(String[] args) {
        TestA testA=  new TestA();
        testA.a();
        //see https://stackoverflow.com/questions/68650850/unsupported-javafx-configuration-classes-were-loaded-from-unnamed-module
       // System.setErr(new PrintStream(NullOutputStream.INSTANCE));
        //或者选择16以下的javafx
        Application.launch(JfxApplication.class, args);
    }

}
