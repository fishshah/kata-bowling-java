package no.finntech.kata;


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BowlingGameTest {

    @Test
    public void Score_Should_not_Be_Zero() {
        assertThat(BowlingGame.getPlayer1Score(1)).isEqualTo(1);
    }

    @Test
    public void shouldGetScore_2_when_1_1() {
        assertThat(BowlingGame.getPlayer1Score(1, 1)).isEqualTo(2);
    }

}
