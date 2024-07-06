package online.yardstrong.javafx.resources;

import javafx.scene.image.Image;
import online.yardstrong.common.exceptions.AppException;
import online.yardstrong.common.text.ResourceMessages;
import online.yardstrong.common.utils.ParamUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

public class ResourcesLoader {
    /**
     * load image from local path
     *
     * @param path local path
     * @return image
     */
    public static Image loadImageFromLocalPath(String path) {
        FileInputStream iconFileInputStream;
        try {
            iconFileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw AppException.of(ResourceMessages.IMAGE_LOAD_FILE_NOT_FOUND.getMessage(path));
        }
        return new Image(iconFileInputStream);
    }

    /**
     * load image from file classpath
     *
     * @param classpath classpath
     * @return image
     */
    public static Image loadImageFromClasspath(String classpath) {
        return new Image(classpathToUrlString(classpath));
    }

    /**
     * classpath transform, start with '/'
     *
     * @param path resource classpath
     * @return path
     */
    public static String classpathToUrlString(String path) {
        return classpathToURL(path).toExternalForm();
    }

    /**
     * classpath transform, start with '/'
     *
     * @param path resource classpath
     * @return path
     */
    public static URL classpathToURL(String path) {
        URL resource = ResourcesLoader.class.getResource(path);
        ParamUtil.assertNotNull(resource, ResourceMessages.RESOURCE_LOAD_FILE_NOT_FOUND, path);
        return resource;
    }
}
