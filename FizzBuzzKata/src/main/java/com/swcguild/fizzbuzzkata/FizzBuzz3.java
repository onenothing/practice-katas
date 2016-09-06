/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.fizzbuzzkata;

/**
 *
 * @author freebagelbob
 */
public class FizzBuzz3 {
    
    public String generate(Integer num) {
        
        
        String s = "";
  
        if (num % 3 == 0) {
            s += "fizz";
        }
        if (num % 5 == 0) {
            s += "buzz";
        }
        
        return !s.isEmpty() ? s: num.toString();
    }

}
