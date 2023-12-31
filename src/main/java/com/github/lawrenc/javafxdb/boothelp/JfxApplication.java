package com.github.lawrenc.javafxdb.boothelp;

import com.github.lawrenc.javafxdb.JavaFXDBApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author : LiuMingyao
 * 2019/12/8 19:53
 *
 * <pre>
 *     1. 初始化spring容器
 *     2. 发出通知，加载用户jfx逻辑
 * </pre>
 * <p>
 * 注意：该类不是启动类，{@link JavaFXDBApplication}才是启动类
 */
@Slf4j
public class JfxApplication extends Application {
    private ConfigurableApplicationContext applicationContext;


    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(JavaFXDBApplication.class).run();
    }

    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new StageInitializer.StageReadyEvent(stage));
    }

    @Override
    public void stop() {
        log.info("stop spring context...");
        applicationContext.close();
        log.info("stop jfx app...");
        Platform.exit();
        log.info("will exit jvm...");
        System.exit(0);
    }
}