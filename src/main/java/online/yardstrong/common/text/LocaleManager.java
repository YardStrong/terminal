package online.yardstrong.common.text;

import online.yardstrong.common.utils.CollectionUtil;
import online.yardstrong.common.utils.StringUtil;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleManager {
    private static ResourceBundle bundle;
    private static final String RESOURCE_BUNDLE_NAME = "i18n/messages";

    static {
        changeLanguage(Locale.of("en", "US"));
    }

    /**
     * change locale, reload messages resource bundle
     *
     * @param locale new locale
     */
    public static void changeLanguage(Locale locale) {
        bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, locale);
    }

    /**
     * get message with key
     *
     * @param key message key
     * @return message
     */
    public static String getMessage(String key) {
        return bundle.getString(key);
    }

    /**
     * get formatted message
     *
     * @param key    message key
     * @param params format params
     * @return message
     */
    public static String formatMessage(String key, Object... params) {
        String template = getMessage(key);
        return StringUtil.isEmpty(template) || CollectionUtil.isEmpty(params) ?
                template : MessageFormat.format(template, params);
    }

}
