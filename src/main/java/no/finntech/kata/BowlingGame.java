package no.finntech.kata;

public class BowlingGame {


    public static int getPlayer1Score(Frame... pins) {
        int result =0;
        for (Frame frame: pins) {
         result = result + frame.getScore();
        }
        return result;

    }

    public static final class Frame {

        private final int t1;
        private final int t2;

        public Frame(int t1, int t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        public int getScore() {
            return t1 + t2;
        }
    }

}
