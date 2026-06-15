//Assignment Magic Square
//Roll no = 44

import java.util.Scanner;

public class Assignment_MagicSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] square = new int[3][3];

        System.out.println("=== Magic Square Checker ===");

        // Input values
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter value at [" + row + "][" + col + "]: ");
                square[row][col] = input.nextInt();
            }
        }

        // Sum of first row
        int targetSum = square[0][0] + square[0][1] + square[0][2];

        boolean isMagic = true;

        // Check rows and columns
        for (int row = 0; row < 3; row++) {

            int rowSum = 0;
            int colSum = 0;

            for (int col = 0; col < 3; col++) {
                rowSum += square[row][col];
                colSum += square[col][row];
            }

            if (rowSum != targetSum || colSum != targetSum) {
                isMagic = false;
                break;
            }
        }

        // Check diagonals
        if (isMagic) {

            int diagonal1 = square[0][0] + square[1][1] + square[2][2];
            int diagonal2 = square[0][2] + square[1][1] + square[2][0];

            if (diagonal1 != targetSum || diagonal2 != targetSum) {
                isMagic = false;
            }
        }

        // Display result
        if (isMagic) {
            System.out.println("This is a Magic Square.");
            System.out.println("Magic Sum = " + targetSum);
        } else {
            System.out.println("This is NOT a Magic Square.");
        }

        input.close();
    }
}
