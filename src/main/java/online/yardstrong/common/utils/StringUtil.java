package online.yardstrong.common.utils;

import java.util.Objects;

public class StringUtil {
    /**
     * judge a string is not empty
     *
     * @param charSequence string
     * @return true: not empty; false: empty
     */
    public static boolean isEmpty(CharSequence charSequence) {
        return Objects.isNull(charSequence) || charSequence.isEmpty();
    }

    /**
     * judge a string is not empty
     *
     * @param charSequence string
     * @return true: not empty; false: empty
     */
    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }
}
