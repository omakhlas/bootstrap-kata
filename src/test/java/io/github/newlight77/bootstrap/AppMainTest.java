package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppMainTest {
    Calculator calculator;
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void myTest() {
        assertEquals(true, true);
    }

    @Test
    void shouldReturn0WhenNumbersIsEmpty() {
        assertEquals(0,calculator.add(""));
    }

}
