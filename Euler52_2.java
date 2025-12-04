//my brain is so fried i just decided to make a second attempt....
//explanation for solving: This time around I will try to sort the numbers before
//checking them.

import java.util.Arrays;
import java.util.Collections;

public class Euler52_2 {

    // sorts a number alphanumerically from 0-9.
    private static int numberSorted(int number) {
        // ISSUE: Parsing the integer removes 0s.
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

        int x = 10000; // OG CountNumber
        int twoX, threeX, fourX, fiveX, sixX; // self explanatory
        boolean solved = false; // also self explanatory
        boolean twoSolved, threeSolved, fourSolved, fiveSolved, sixSolved;
        System.out.println(numberSorted(x));
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
            if (x > 2000000) {
                System.out.println("Too much!");
                break;
            }
            if (twoSolved && threeSolved && fourSolved && fiveSolved && sixSolved) {
                solved = true;
            }
        }
        if (solved) {
            System.out.println("Answer is " + x);
        }
    }
}
