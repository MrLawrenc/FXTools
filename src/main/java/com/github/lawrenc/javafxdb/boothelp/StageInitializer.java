package com.github.lawrenc.javafxdb.boothelp;

import com.github.lawrenc.javafxdb.config.JfxConfiguration;
import com.github.lawrenc.javafxdb.controller.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * @author MrLawrenc
 * date  2020/9/21 21:46
 * <p>
 * 加载jfx逻辑
 */
@Component
@Slf4j
public class StageInitializer implements ApplicationListener<StageInitializer.StageReadyEvent> {
    @Autowired
    private JfxConfiguration jfxConfiguration;
    private final ApplicationContext applicationContext;
    @Autowired
    private MainController controller;

    public StageInitializer(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        Stage stage = stageReadyEvent.getStage();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(jfxConfiguration.getMainFxml().getURL());
            fxmlLoader.setControllerFactory(applicationContext::getBean);

            Parent parent = fxmlLoader.load();
            stage.getIcons().add(new Image(jfxConfiguration.getTitleResource().getInputStream()));
            stage.setScene(new Scene(parent));
            stage.setTitle(jfxConfiguration.getStageTitle());
            stage.show();

            //自适应
            stage.widthProperty().addListener((observableValue, oldValue, newValue) -> {

            });
            stage.heightProperty().addListener((observableValue, oldValue, newValue) -> {
                if (Double.isNaN(oldValue.doubleValue())) {
                    return;
                }
                TabPane tabPane = (TabPane) stage.getScene().getRoot();
                double heightRatio = newValue.doubleValue() / oldValue.doubleValue();
                Tab tab = tabPane.getTabs().get(1);
                AnchorPane anchorPane = (AnchorPane) tab.getContent();
                TableView tableView = (TableView) anchorPane.getChildren().get(0);


                tableView.setLayoutY(tableView.getLayoutY() * heightRatio);
            });
        } catch (Exception e) {
            log.error("start jfx fail,will close!", e);
            stage.close();
        }
    }

    public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return (Stage) getSource();
        }
    }

}