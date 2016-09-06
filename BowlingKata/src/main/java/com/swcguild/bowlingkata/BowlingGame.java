package com.swcguild.bowlingkata;

/**
 *
 * @author freebagelbob
 */
public class BowlingGame {

    private int roll = 0;
    private int[] rolls = new int[21];
    
    public void roll(int...rolls) {
        for (int pinsDown : rolls) 
            roll(pinsDown);
        }

    public void roll(int pinsDown) {
        rolls[roll++] = pinsDown;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
//            if (rolls[cursor] == 10) { //strike
            if (isStrike(cursor)) { //strike
                score += 10 + rolls[cursor+1] + rolls[cursor+2];
                cursor++;
            }
//            else if (rolls[cursor] + rolls[cursor + 1] == 10) { //spare
            else if (isSpare(cursor)) { //spare
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }

    private boolean isStrike(int cursor) {
        return rolls[cursor] == 10;
    }

}
