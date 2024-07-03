package online.yardstrong.javafx.images;

import javafx.scene.image.Image;
import online.yardstrong.common.exceptions.AppException;
import online.yardstrong.common.text.ImageMessages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageLoader {
    public static Image loadFromLocalPath(String path) {
        FileInputStream iconFileInputStream = null;
        try {
            iconFileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw AppException.of(ImageMessages.IMAGE_LOAD_FILE_NOT_FOUND.getMessage(path));
        }
        return new Image(iconFileInputStream);
    }
}
