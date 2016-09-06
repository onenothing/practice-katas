package com.swcguild.fizzbuzzkata;

/**
 *
 * @author freebagelbob
 */
public class FizzBuzz {

    public String fizz(Integer inputNumber) {
        
        if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)) {
            return "fizzbuzz";
        } else if (inputNumber % 3 == 0) {
            return "fizz";
        } else if (inputNumber % 5 == 0) {
            return "buzz";
        }
        return inputNumber.toString();
    }
}
