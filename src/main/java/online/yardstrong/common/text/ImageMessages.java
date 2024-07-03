package online.yardstrong.common.text;

public enum ImageMessages implements IMessages {
    IMAGE_LOAD_FILE_NOT_FOUND("IMAGE_LOAD_FILE_NOT_FOUND.regexp"),
    ;
    private final String key;

    ImageMessages(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }
}
