package com.swcguild.fizzbuzzkata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzbuzzIsPassedNumberReturnsThatNumber() {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void fizzBuzzIsPassedTwoItReturnsTwo() {
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void fizzBuzzIsPassedMutipleOfThreeItReturnsFizz() {
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }
    
    @Test
    public void fizzBuzzIsPassedMutipleOfFiveItReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(10));
    }
    
     @Test
    public void fizzBuzzIsPassedMutipleOfThreeAndFiveItReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz.fizz(15));
        assertEquals("fizzbuzz", fizzBuzz.fizz(30));
    }
}
