package no.finntech.kata;

public class BowlingGame {


    public static int getPlayer1Score(Frame... frames) {
        int result = 0;
        for (int i = 0; i<frames.length; i++) {
            result = result + frames[i].getScore();
            if (frames[i].isSpare()) {
                if (frames[i].isLastFrame()) {
                    result = result + frames[i].t3;
                }
                else {
                    result = result + frames[i+1].t1;

                }
            }
            if (frames[i].isStrike()) {
                result = result + frames[i+1].getScore();
                if (frames[i+1].isStrike()) {
                    result = result + frames[i+2].t1;
                }
            }
        }
        return result;

    }

    public static final class Frame {

        private final int t1;
        private final int t2;
        private final int t3;

        public Frame(int t1, int t2) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = 0;
        }

        public Frame(int t1, int t2, int t3) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }

        public int getScore() {
            return t1 + t2;
        }

        public boolean isSpare() {

            return t1 + t2 == 10 && t1 != 10;
        }

        public boolean isStrike() {
            return t1 == 10;
        }

        public boolean isLastFrame() {
            return t3 !=0;
        }
    }

}
