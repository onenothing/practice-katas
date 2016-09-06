
package com.swcguild.fizzbuzzkata;


public class FizzBuzz4 {
    
    public String fizz(Integer inputNumber){
        
        String s = "";
        
//        if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)) {
//            s +=  "fizzbuzz";
//        }
        if (inputNumber % 3 == 0) {
            s += "fizz";
        }
        if (inputNumber % 5 == 0) {
            s += "buzz";
        }
        
        return !s.isEmpty() ? s: inputNumber.toString();
    }
}
