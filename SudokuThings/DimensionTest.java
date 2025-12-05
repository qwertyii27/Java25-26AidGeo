package SudokuThings;

//Similar to StringText but testing multidimensional arrays.
//Stack Overflow has been used HEAVILY, I knew almost none of this
import java.util.Arrays;
import java.util.Scanner;

public class DimensionTest {
    public static void main(String[] args) {
        String myStr = "Grid 02\n" + //
                "200080300\n" + //
                "060070084\n" + //
                "030500209\n" + //
                "000105408\n" + //
                "000000000\n" + //
                "402706000\n" + //
                "301007040\n" + //
                "720040060\n" + //
                "004010003";
        Scanner in = new Scanner(myStr);
        in.nextLine();
        String[] numsTxt = in.nextLine().split("");

        int[] row1 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row1[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row2 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row2[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row3 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row3[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row4 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row4[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row5 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row5[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row6 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row6[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row7 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row7[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row8 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row8[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        numsTxt = in.nextLine().split("");
        int[] row9 = new int[numsTxt.length];
        for (int i = 0; i < numsTxt.length; i++) {
            row9[i] = Integer.parseInt(numsTxt[i]);
        }
        Arrays.fill(numsTxt, null);

        // Everything up to now just arrays the numbers, this will now make them 2D
        int[][] grid1 = new int[9][9]; // int [row][column]

        // do not mess with this IT WILL BREAK!!!!
        for (int i = 0; i < 9; i++)
            grid1[0][i] = row1[i];
        for (int i = 0; i < 9; i++)
            grid1[1][i] = row2[i];
        for (int i = 0; i < 9; i++)
            grid1[2][i] = row3[i];
        for (int i = 0; i < 9; i++)
            grid1[3][i] = row4[i];
        for (int i = 0; i < 9; i++)
            grid1[4][i] = row5[i];
        for (int i = 0; i < 9; i++)
            grid1[5][i] = row6[i];
        for (int i = 0; i < 9; i++)
            grid1[6][i] = row7[i];
        for (int i = 0; i < 9; i++)
            grid1[7][i] = row8[i];
        for (int i = 0; i < 9; i++)
            grid1[8][i] = row9[i];

        // print test below
        System.out.printf("     Grid #02%n%n");
        for (int i = 0; i < 9; i++) {
            for (int n = 0; n < 9; n++) {
                System.out.print(grid1[i][n]);
                System.out.print(" ");
                if (n == 2 || n == 5)
                    System.out.print("|");
            }
            System.out.println();
            if (i == 2 || i == 5)
                System.out.println("-------------------");
        }
        in.close();
    }
}
