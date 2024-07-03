package online.yardstrong.terminal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import online.yardstrong.common.text.AppMessages;
import online.yardstrong.javafx.images.ImageLoader;

import java.io.IOException;

public class TerminalApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle(AppMessages.APP_NAME.getMessage());
        Image logo = ImageLoader.loadFromLocalPath("src/main/resources/images/logo.png");
        stage.getIcons().add(logo);
        stage.initStyle(StageStyle.DECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(TerminalApp.class.getResource("window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}