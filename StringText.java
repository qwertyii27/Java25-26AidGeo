//By Georgio
//Note to Aidan: This program showcases how we turn this grid into an array of integers. 
//IT WORKS! HOORAY!

import java.util.Scanner;

public class StringText {
    public static void main(String[] args) {
        String myStr = "Grid 01\n" + //
                "003020600\n" + //
                "900305001\n" + //
                "001806400\n" + //
                "008102900\n" + //
                "700000008\n" + //
                "006708200\n" + //
                "002609500\n" + //
                "800203009\n" + //
                "005010300";
        Scanner in = new Scanner(myStr);
        in.nextLine();
        String[] rowsTxt = in.nextLine().split("");
        for (String s : rowsTxt) {
            System.out.println(s);
        }
        System.out.println("------------------");

        int[] rows = new int[rowsTxt.length];
        for (int i = 0; i < rowsTxt.length; i++) {
            rows[i] = Integer.parseInt(rowsTxt[i]);
        }
        for (int s : rows) {
            System.out.println(s);
        }
    }
}
