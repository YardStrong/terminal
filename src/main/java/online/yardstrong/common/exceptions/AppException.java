package online.yardstrong.common.exceptions;

public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }

    public static AppException of(String message) {
        return new AppException(message);
    }
}
