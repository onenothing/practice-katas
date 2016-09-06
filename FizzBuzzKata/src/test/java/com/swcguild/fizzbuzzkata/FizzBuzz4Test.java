package com.swcguild.fizzbuzzkata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzz4Test {
    
    private FizzBuzz4 fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz4();
    }

    @Test
    public void whenPassedAOneFizzBuzzReturnsOne() {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenPassedATwoFizzBuzzReturnsTwo() {
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz() {
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(125));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz.fizz(30));
        assertEquals("fizzbuzz", fizzBuzz.fizz(75));
    }

}
