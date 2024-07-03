package online.yardstrong.common.text;

public enum AppMessages implements IMessages {
    APP_NAME("APP_NAME"),
    ;
    private final String key;

    AppMessages(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }
}
