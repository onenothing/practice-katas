package com.swcguild.bowlingkata;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author freebagelbob
 */
public class BowlingGameTest {

//    @Test
//    public void canMakeGame() {
//        new BowlingGame(); 
//    }
//    @Test
//    public void canRollBall() {
//        BowlingGame game = new BowlingGame();
//        game.roll(0);
//    }
    private BowlingGame game;

    @Before
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    public void canScoreGutterGame() {
        int times = 20;
        int pinsDown = 0;
//        roll(20, 0);
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
//        roll(20, 1);
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void canScoreSpareFollowedByThree() {
//        game.roll(5);
//        game.roll(5);
//        game.roll(3);
//        roll(17,0);
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(16));
    }
    
    @Test
    public void canScoreAStrikeFollowedByThreeThenThree() {
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
            assertThat(game.score(), is(22));
    }
    
    @Test
    public void canScorePerfectGame() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
            assertThat(game.score(), is(300));
    }

//    private void roll(int times, int pinsDown) {
//        for (int i = 0; i < times; i++) {
//            game.roll(pinsDown);
    
    }


