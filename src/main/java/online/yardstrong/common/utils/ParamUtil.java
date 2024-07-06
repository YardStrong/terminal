package online.yardstrong.common.utils;

import online.yardstrong.common.exceptions.AppException;
import online.yardstrong.common.text.IMessages;

import java.util.Objects;

/**
 * 参数判断 param util
 */
public class ParamUtil {
    /**
     * judge object is null
     *
     * @param o object
     * @return true: null; false: not null
     */
    public static boolean isNull(Object o) {
        return null == o;
    }

    /**
     * judge object not null
     *
     * @param o object
     * @return true: not null; false: null
     */
    public static boolean notNull(Object o) {
        return null != o;
    }

    /**
     * require object not null
     *
     * @param o   object
     * @param <T> object class
     * @return object
     */
    public static <T> T requireNotNull(T o) {
        return Objects.requireNonNull(o);
    }

    /**
     * assert true else throw exception
     *
     * @param assertCause        cause
     * @param errorMessage       error message
     * @param errorMessageParams error message param
     */
    public static void assertTrue(boolean assertCause, IMessages errorMessage, Object... errorMessageParams) {
        if (assertCause) {
            throw AppException.of(errorMessage.getMessage(errorMessageParams));
        }
    }

    /**
     * assert object not null else throw exception
     *
     * @param object             object
     * @param errorMessage       error message
     * @param errorMessageParams error message param
     */
    public static void assertNotNull(Object object, IMessages errorMessage, Object... errorMessageParams) {
        if (isNull(object)) {
            throw AppException.of(errorMessage.getMessage(errorMessageParams));
        }
    }
}
