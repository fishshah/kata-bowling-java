package no.finntech.kata;


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BowlingGameTest {

    @Test
    public void Score_Should_not_Be_Zero() {
        assertThat(BowlingGame.getPlayer1Score(new BowlingGame.Frame(1, 0))).isEqualTo(1);
    }

    @Test
    public void shouldGetScore_2_when_1_1() {
        assertThat(BowlingGame.getPlayer1Score(new BowlingGame.Frame(1, 1))).isEqualTo(2);
    }

    @Test
    public void Should_Get_Spare() {
        assertThat(BowlingGame.getPlayer1Score(new BowlingGame.Frame(1, 9), new BowlingGame.Frame(8, 0))).isEqualTo(26);
    }

    @Test
    public void strikeShouldAddNextTwoThrowsToScore() {
        assertThat(BowlingGame.getPlayer1Score(new BowlingGame.Frame(10, 0), new BowlingGame.Frame(1, 2))).isEqualTo(16);
    }
}
