
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumsTest {
    
    public PrimeNums primes;
    
    @Before
    public void setUp() {
        primes = new PrimeNums();
    }
    
    private List<Integer> list(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }
    
    @Test
    public void testForEmptyList() {
        assertEquals(list(), primes.generate(1));
    }
    
    @Test
    public void testForPrimeTwo() {
        assertEquals(list(2), primes.generate(2));
    }
    
    @Test
    public void testForPrimeThree() {
        assertEquals(list(3), primes.generate(3));
    }
    
    @Test
    public void testForFour() {
        assertEquals(list(2,2), primes.generate(4));
    }
    
    @Test
    public void testForSix() {
        assertEquals(list(2,3), primes.generate(6));
    }
    
    @Test
    public void testForEight() {
        assertEquals(list(2,2,2), primes.generate(8));
    }
    
    @Test
    public void testForNine() {
        assertEquals(list(3,3), primes.generate(9));
    }
    
    @Test
    public void testFor125() {
        assertEquals(list(5,5,5), primes.generate(125));
    }
    
  
}
