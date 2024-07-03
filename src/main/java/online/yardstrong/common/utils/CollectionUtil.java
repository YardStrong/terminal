package online.yardstrong.common.utils;

import java.util.Objects;

public class CollectionUtil {
    /**
     * judge an array is empty
     *
     * @param array array object
     * @param <T>   any type
     * @return true: empty; false: not empty
     */
    public static <T> boolean isEmpty(T[] array) {
        return Objects.isNull(array) || 0 == array.length;
    }

    /**
     * judge an array is not empty
     *
     * @param array array object
     * @param <T>   any type
     * @return true: not empty; false: empty
     */
    public static <T> boolean isNotEmpty(T[] array) {
        return !isEmpty(array);
    }
}
