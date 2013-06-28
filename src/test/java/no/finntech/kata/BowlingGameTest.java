package no.finntech.kata;


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BowlingGameTest {

    @Test
    public void shouldGetScore_1_when_1_0() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(1, 0)))
                .isEqualTo(1);
    }

    @Test
    public void shouldGetScore_2_when_1_1() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(1, 1)))
                .isEqualTo(2);
    }

    @Test
    public void spareShouldAddNextThrowToFrameScore() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(1, 9),
                new BowlingGame.Frame(8, 0)))
                .isEqualTo(26);
    }

    @Test
    public void strikeShouldAddNextTwoThrowsToFrameScore() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10, 0),
                new BowlingGame.Frame(1, 2)))
                .isEqualTo(16);
    }

    @Test
    public void next_To_Throws_Should_Be_Double_Strike() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10, 0),  //23
                new BowlingGame.Frame(10, 0),  //17
                new BowlingGame.Frame(3, 4)))  //7
                .isEqualTo(47);
    }

    @Test
    public void lastFrameWhenSpare() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(9,1,9)))
                .isEqualTo(19);
    }

    @Test
    public void firstThrowInlastFrameIsStrike() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10,1,4)))
                .isEqualTo(15);
    }

    @Test
    public void lastThrowInlastFrameIsOnlyStrikes() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10,10,10)))
                .isEqualTo(30);
    }

    @Test
    public void lastThrowInlastFrameIsStrike() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(5,5,10)))
                .isEqualTo(20);
    }

    @Test
    public void perfectGame() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,0),
                new BowlingGame.Frame(10,10,10)))
                .isEqualTo(300);
    }

    @Test
    public void almostPerfectGame() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(10,0), // 30
                new BowlingGame.Frame(10,0), // 60
                new BowlingGame.Frame(10,0), // 90
                new BowlingGame.Frame(10,0), // 120
                new BowlingGame.Frame(10,0), // 150
                new BowlingGame.Frame(10,0), // 180
                new BowlingGame.Frame(10,0), // 210
                new BowlingGame.Frame(10,0), // 232
                new BowlingGame.Frame(10,0), // 252
                new BowlingGame.Frame(2,8,10))) // 272
                .isEqualTo(272);
    }

    @Test
    public void game_of_spare() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1),
                new BowlingGame.Frame(9,1,9)))
                .isEqualTo(190);
    }

    @Test
    public void lastThrowInlastFrameIsZero() {
        assertThat(BowlingGame.getPlayer1Score(
                new BowlingGame.Frame(5,5,0)))
                .isEqualTo(10);
    }
}
