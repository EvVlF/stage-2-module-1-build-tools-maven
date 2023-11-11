package com.epam.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {"16", "65.01", "151/2486", "1.101/9.901", "+16", "+65.01", "+151/2486", "+1.101/9.901"})
    void isPositiveNumber(String str) {
        assertTrue(StringUtils.isPositiveNumber(str));
    }

    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {"-1165", "-112.01", "-64/647", "-1.101/9.901"})
    void skipNonPositiveNumber(String str){
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}