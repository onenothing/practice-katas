package com.swcguild.fizzbuzzkata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class FizzBuzz2Test {
    
    FizzBuzz2 fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz2();
    }

    @Test
    public void whenFizzBuzzIsPassedNumberOneItReturnsOne() {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsTwo() {
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
        assertEquals("buzz", fizzBuzz.fizz(10));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz.fizz(15));
        assertEquals("fizzbuzz", fizzBuzz.fizz(30));
    }

}
