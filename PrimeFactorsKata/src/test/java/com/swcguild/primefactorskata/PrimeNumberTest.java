/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class PrimeNumberTest {

    private PrimeNumber prime;

    @Before
    public void setUp() {
        prime = new PrimeNumber();
    }

    private List<Integer> list(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }

    @Test
    public void Zero() {
        try {
            prime.generate(0);
            fail("Argument out of range is not accepted");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void primeNumberOne() {
        assertEquals(list(), prime.generate(1));
    }

    @Test
    public void primeNumberTwo() {
        assertEquals(list(2), prime.generate(2));
    }

    @Test
    public void primeNumberThree() {
        assertEquals(list(3), prime.generate(3));
    }

    @Test
    public void primeNumberFour() {
        assertEquals(list(2, 2), prime.generate(4));
    }

    @Test
    public void primeNumberSix() {
        assertEquals(list(2, 3), prime.generate(6));
    }

    @Test
    public void primeNumberEight() {
        assertEquals(list(2, 2, 2), prime.generate(8));
    }

    @Test
    public void primeNumberNine() {
        assertEquals(list(3, 3), prime.generate(9));
    }

    @Test
    public void primeNumber81() {
        assertEquals(list(3, 3, 3, 3), prime.generate(81));
    }

}
