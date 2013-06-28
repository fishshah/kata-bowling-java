package no.finntech.kata;

public class BowlingGame {


    public static int getPlayer1Score(int... pins) {
        int result =0;
        for (int i: pins) {
         result = result + i;
        }
        return result;

    }
}
