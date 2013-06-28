package no.finntech.kata;

public class BowlingGame {


    public static int getPlayer1Score(Frame... frames) {
        int result = 0;
        for (int i = 0; i<frames.length; i++) {
            result = result + frames[i].getScore();
            if (frames[i].isSpare()) {
                result = result + frames[i+1].t1;
            }
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

        public boolean isSpare() {
            return t1 + t2 == 10;
        }
    }

}
