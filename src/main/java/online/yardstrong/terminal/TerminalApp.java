package online.yardstrong.terminal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import online.yardstrong.common.text.AppMessages;
import online.yardstrong.javafx.resources.ResourcesConstants;
import online.yardstrong.javafx.resources.ResourcesLoader;

import java.io.IOException;

public class TerminalApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle(AppMessages.APP_NAME.getMessage());
        Image logo = ResourcesLoader.loadImageFromClasspath(ResourcesConstants.IMAGE_LOGO_PNG);
        stage.getIcons().add(logo);
        stage.initStyle(StageStyle.DECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(ResourcesLoader.classpathToURL("/views/window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}