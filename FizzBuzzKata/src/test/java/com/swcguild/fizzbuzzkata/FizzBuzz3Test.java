/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.fizzbuzzkata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class FizzBuzz3Test {
    
    private FizzBuzz3 fizzbuzz;
    
 @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz3();
    }
    
    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        assertEquals("1", fizzbuzz.generate(1));
    }
    
    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsATwo() {
        assertEquals("2", fizzbuzz.generate(2));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAThreeItReturnsAFizz() {
        assertEquals("fizz", fizzbuzz.generate(3));
        assertEquals("fizz", fizzbuzz.generate(9));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAFiveItReturnsABuzz() {
        assertEquals("buzz", fizzbuzz.generate(5));
        assertEquals("buzz", fizzbuzz.generate(10));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzbuzz.generate(15));
        assertEquals("fizzbuzz", fizzbuzz.generate(75));
    }
    

    
    
    
  
}
