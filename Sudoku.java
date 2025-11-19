import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Su Doku: ");

        String input = "003020600900305001001806400008102900700000008006708200002609500800203009005010300";
        int box = 0;
        int numNum = 0;
        char board;
        int[][][] boardArr = new int[10][10][10]; // [row][column][box]
        for (int i = 1; i <= 9; i++) { // i is row
            int numPlace = numNum - ((i - 1) * 9); // finds if it is 1st, 2nd, 3rd, etc in the row
            board = input.charAt(i);
            for (int n = 1; n <= 9; n++) { // n is column
                numNum++;
                if (numPlace >= 1 && numPlace <= 3) { // finding box number
                    if (i <= 3)
                        box = 1;
                    if (i <= 6 && i >= 4)
                        box = 4;
                    if (i <= 9 && i >= 7)
                        box = 7;
                } else if (numPlace >= 4 && numPlace <= 6) {
                    if (i <= 3)
                        box = 2;
                    if (i <= 6 && i >= 4)
                        box = 5;
                    if (i <= 9 && i >= 7)
                        box = 8;
                } else if (numPlace >= 7 && numPlace <= 9) {
                    if (i <= 3)
                        box = 3;
                    if (i <= 6 && i >= 4)
                        box = 6;
                    if (i <= 9 && i >= 7)
                        box = 9;
                } else {
                    System.err.println("error");
                }
                System.out.println(i + " " + n + " " + box);
                boardArr[i][n][box] = Integer.parseInt(String.valueOf(board));
            }
            System.out.println(boardArr[9][9][0]);
        }
    }
}