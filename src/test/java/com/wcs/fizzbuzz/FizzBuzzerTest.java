package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertTrue(fizzBuzzer.execute(7).matches("(.*)Wizz(.*)"));
        assertTrue(fizzBuzzer.execute(14).matches("(.*)Wizz(.*)"));
    }

    @Test
    public void executeShouldReturnFizzIfFigureIncludes3() {
        assertTrue(fizzBuzzer.execute(3).matches("(.*)Fizz(.*)"));
        assertTrue(fizzBuzzer.execute(131).matches("(.*)Fizz(.*)"));
    }

    @Test
    public void executeShouldReturnBuzzIfFigureIncludes5() {
        assertTrue(fizzBuzzer.execute(5).matches("(.*)Buzz(.*)"));
        assertTrue(fizzBuzzer.execute(151).matches("(.*)Buzz(.*)"));
    }
    
    @Test
    public void executeShouldReturnWizzIfFigureIncludes7() {
        assertTrue(fizzBuzzer.execute(17).matches("(.*)Wizz(.*)"));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
    }

}
