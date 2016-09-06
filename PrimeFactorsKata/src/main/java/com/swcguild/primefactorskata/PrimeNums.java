package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {

    public static List<Integer> generate(int nums) {

        ArrayList<Integer> prime = new ArrayList<>();
        
        for (int digit = 2; nums > 1; digit++) {
            for (; nums % digit == 0; nums /= digit) {
                prime.add(digit);
            }
        }

        return prime;
    }

}
