package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void shouldReturn0WhenNumbersIsEmpty() throws Exception{
        assertEquals(0,calculator.add(""));
    }

    @Test
    void shouldReturn1WhenNumbersIs1() throws Exception{
        assertEquals(1,calculator.add("1"));
    }

    @Test
    void shouldReturn3WhenNumbersIs1_2() throws Exception{
        assertEquals(3,calculator.add("1,2"));
    }

    @Test
    void shouldReturn3WhenNumbersIs1_n_2() throws Exception{
        assertEquals(3,calculator.add("1\n2"));
    }

    @Test
    void shouldReturn6WhenNumbersIs1_n2_3() throws Exception{
        assertEquals(6,calculator.add("1\n2,3"));
    }

    @Test
    void shouldThrowExceptionWhenNumbersContainsNegativeNb(){
        assertThrows(Exception.class, () -> {
            calculator.add("1,2,-3");
        });
    }

    @Test
    void shouldReturn2WhenNumbersIs1_1001() throws Exception{
        assertEquals(2,calculator.add("2,1001"));
    }

}
