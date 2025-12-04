public class Euler52 {
    public static void main(String[] args) {
        // overall solve condition
        boolean solved = false;
        // solve conditions for 2x 3x 4x 5x and 6x
        boolean solvedbig2 = false, solvedbig3 = false, solvedbig4 = false, solvedbig5 = false, solvedbig6 = false;
        // starting number to check for
        int lol = 125874;
        int solvedint = 0;

        while (!solved) {
            int lolLength = Integer.toString(lol).length();
            // if the number being checked is less than six digits, continue to save time.
            if (lolLength < 6) {
                continue;
            }
            // lol2, lol3, lol4, lol5, and lol6 are checks for 2x, 3x, 4x, 5x, and 6x.
            int lol2 = lol * 2, lol3 = lol * 3, lol4 = lol * 4, lol5 = lol * 5, lol6 = lol * 6;
            for (int i = 0; i < lolLength; i++) {
                // lol3
                for (int g = 0; g < lolLength; g++) {
                    if (Integer.toString(lol2).charAt(i) == Integer.toString(lol3).charAt(g)) {
                        solvedint++;
                    }
                }
                if (solvedint == 6) {
                    solvedbig2 = true;
                    solvedbig3 = true;
                }

                solvedint = 0;
                // lol4
                for (int g = 0; g < lolLength; g++) {
                    if (Integer.toString(lol2).charAt(i) == Integer.toString(lol4).charAt(g)) {
                        solvedint++;
                    }
                }
                if (solvedint == 6) {
                    solvedbig4 = true;
                }

                solvedint = 0;
                // lol5
                for (int g = 0; g < lolLength; g++) {
                    if (Integer.toString(lol2).charAt(i) == Integer.toString(lol5).charAt(g)) {
                        solvedint++;
                    }
                }
                if (solvedint == 6) {
                    solvedbig5 = true;
                }

                solvedint = 0;
                // lol6
                for (int g = 0; g < lolLength; g++) {
                    if (Integer.toString(lol2).charAt(i) == Integer.toString(lol6).charAt(g)) {
                        solvedint++;
                    }
                }
                if (solvedint == 6) {
                    solvedbig6 = true;
                }

                solvedint = 0;
            }
            if (solvedbig2 && solvedbig3 && solvedbig4 && solvedbig5 && solvedbig6) {
                System.out.println(lol);
                solved = true;
                System.out.println(solvedbig2);
                System.out.println(solvedbig3);
                System.out.println(solvedbig4);
                System.out.println(solvedbig5);
                System.out.println(solvedbig6);
            }

            solvedbig2 = false;
            solvedbig3 = false;
            solvedbig4 = false;
            solvedbig5 = false;
            solvedbig6 = false;
            lol++;
        }
    }
}
