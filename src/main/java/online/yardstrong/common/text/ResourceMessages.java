package online.yardstrong.common.text;

public enum ResourceMessages implements IMessages {
    IMAGE_LOAD_FILE_NOT_FOUND("IMAGE_LOAD_FILE_NOT_FOUND.regexp"),
    RESOURCE_LOAD_FILE_NOT_FOUND("RESOURCE_LOAD_FILE_NOT_FOUND.regexp"),
    ;
    private final String key;

    ResourceMessages(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }
}
