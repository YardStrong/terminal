package online.yardstrong.learn;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import online.yardstrong.common.text.AppMessages;
import online.yardstrong.javafx.resources.ResourcesLoader;

public class No1SimpleWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(AppMessages.APP_NAME.getMessage());

        Image logo = ResourcesLoader.loadImageFromLocalPath("src/main/resources/images/logo.png");
        stage.getIcons().add(logo);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
