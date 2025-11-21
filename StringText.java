//By Georgio
//Note to Aidan: This program showcases how we turn this grid into an array of integers. 
//IT WORKS! HOORAY!

import java.util.Scanner;

public class StringText {
    public static void main(String[] args) {
        String myStr = "Grid 01\n" + // I made sure to paste this exactly as it would be in the txt file
                "003020600\n" + // meaning that when we figure out FileReader, this should still work
                "900305001\n" + // with the same program (Dw about FileReader yet lol)
                "001806400\n" + //
                "008102900\n" + //
                "700000008\n" + //
                "006708200\n" + //
                "002609500\n" + //
                "800203009\n" + //
                "005010300";
        Scanner in = new Scanner(myStr); // simply using the string as a source instead of user input
        in.nextLine(); // getting rid of the annoying "Grid 01"
        String[] rowsTxt = in.nextLine().split("");
        for (String s : rowsTxt) { // note: this is a for-each loop, aidan. Read here:
                                   // https://www.w3schools.com/java/java_foreach_loop.asp
            System.out.println(s);
        }
        System.out.println("------------------");

        int[] rows = new int[rowsTxt.length];
        for (int i = 0; i < rowsTxt.length; i++) {
            rows[i] = Integer.parseInt(rowsTxt[i]); // individually parses each string entry into an int entry
        }
        for (int s : rows) { // another for-each loop
            System.out.println(s);
        }
    }
}
