package com.github.lawrenc.javafxdb.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * @author : MrLawrenc
 * date  2020/9/21 22:40
 * <p>
 * jfx配置类
 */
@Configuration
@Component
@Data
@ConfigurationProperties("jfx")
public class JfxConfiguration {
    @Value("classpath:/Main.fxml")
    private Resource mainFxml;
    @Value("classpath:/title.jpg")
    private Resource titleResource;
    private boolean openBrowser;
    private String stageTitle;

}