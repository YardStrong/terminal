package online.yardstrong.common.text;

public interface IMessages {
    /**
     * get message key
     *
     * @return message key
     */
    String getKey();

    /**
     * get formatted message
     *
     * @param params format params
     * @return message
     */
    default String getMessage(Object... params) {
        return LocaleManager.formatMessage(this.getKey(), params);
    }
}
