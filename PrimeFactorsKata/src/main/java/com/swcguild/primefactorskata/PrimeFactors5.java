package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors5 {

    public static List<Integer> generate(int num) {

        List<Integer> primes = new ArrayList<>();
         
        
        for  (int digit = 2; num > 1; digit++) {
            for (; num % digit == 0; num /= digit) {
                primes.add(digit);
                num /= digit; 
            }
        }
            if (num > 1) {
                primes.add(num);
            }
        
        return primes;
    }

}
