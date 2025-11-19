import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Su Doku: ");
        
        int input;
        int box = 0;
        int numNum = 0;
        String board = in.nextLine();
        int[][][] boardArr = new int[9][9][9]; //[row][column][box]
        for (int i = 0; i <= 9; i++){ //i is row
            int numPlace = numNum - (i*9); // finds if it is 1st, 2nd, 3rd, etc in the row
            board = input.charAt(i);
            for (int n = 0; n <= 9; n++){ // n is column
                numNum++;
                if (numPlace -  >= 1 && numPlace <= 3){ //finding box number
                    if (i<= 3) box = 1;
                    if (i<= 6 && >= 4) box = 2;
                    if (i<= 9 && >= 7) box = 3;
                } else if (numPlace >= 4 && numPlace <= 6){
                    if (i<= 3) box = 4;
                    if (i<= 6 && >= 4) box = 5;
                    if (i<= 9 && >= 7) box = 6;
                } else if (numPlace >= 7 && numPlace <= 9){
                    if (i<= 3) box = 7;
                    if (i<= 6 && >= 4) box = 8;
                    if (i<= 9 && >= 7) box = 9;
                }
                System.out.println(i+n+box);
            }
        }
    }
}