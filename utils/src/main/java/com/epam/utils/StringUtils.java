package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return str.matches("\\+?\\d+(?:\\.\\d+)?(?:/(?:\\d+(?:\\.\\d+)?)?)?") && !str.startsWith("-");
    }
}
