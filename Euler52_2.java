//Summary: This project looks for a number that has the same digits as x, 2x, 3x, 4x, 5x, and 6x.
// To complete it, we begit at 1 and sort the digits of each number from 9 to 0. If all of the
// numbers are equal, then that is the solution.

import java.util.Arrays;

public class Euler52_2 {

    // sorts a number alphanumerically from 0-9.
    private static int numberSorted(int number) {
        // ISSUE: Parsing the integer removes 0s. SOLUTION: Reverse.
        String number2 = Integer.toString(number);
        char[] sortNum = number2.toCharArray(); // yes i looked up how to do this.
        Arrays.sort(sortNum); // only way to avoid 60 extra line of code btw.

        // To avoid 0s being removed, the order must be reversed. I looked up help
        // for this process.
        for (int i = 0; i < sortNum.length / 2; i++) {
            char thing = sortNum[i];
            sortNum[i] = sortNum[-i - 1 + sortNum.length];
            sortNum[-i - 1 + sortNum.length] = thing;
        }
        String sortedNum = String.valueOf(sortNum);
        number = Integer.parseInt(sortedNum);
        return number;
    }

    public static void main(String[] args) {

        int x = 1; // OG CountNumber
        int twoX, threeX, fourX, fiveX, sixX; // self explanatory
        boolean solved = false; // also self explanatory
        boolean twoSolved, threeSolved, fourSolved, fiveSolved, sixSolved; // checks if x = 2x, x = 3x, etc.
        while (!solved) {
            x++;
            twoSolved = false;
            threeSolved = false;
            fourSolved = false;
            fiveSolved = false;
            sixSolved = false;
            twoX = x * 2;
            threeX = x * 3;
            fourX = x * 4;
            fiveX = x * 5;
            sixX = x * 6;
            if (numberSorted(twoX) == numberSorted(x)) {
                twoSolved = true;
            }
            if (numberSorted(threeX) == numberSorted(x)) {
                threeSolved = true;
            }
            if (numberSorted(fourX) == numberSorted(x)) {
                fourSolved = true;
            }
            if (numberSorted(fiveX) == numberSorted(x)) {
                fiveSolved = true;
            }
            if (numberSorted(sixX) == numberSorted(x)) {
                sixSolved = true;
            }

            if (twoSolved && threeSolved && fourSolved && fiveSolved && sixSolved) {
                solved = true; // if all are the same, solution has been reached.
            }
        }
        if (solved) {
            System.out.println(x); // funny sorted version
        }
    }
}