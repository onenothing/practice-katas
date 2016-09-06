/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freebagelbob
 */
public class PrimeNumber {

    public static List<Integer> generate(int num) {

        List<Integer> primes = new ArrayList<Integer>();
        
        int digit =2;
        
        if (num <= 0) {
            throw new IllegalArgumentException("Eat some bulch");
        }
        
        while (num > 1) {
            while (num % digit == 0) {
                primes.add(digit);
                num /= digit;
            }
            digit++;
        }
//        if (num > 1) {
//            primes.add(num);
//        }
        return primes;
    }

}
