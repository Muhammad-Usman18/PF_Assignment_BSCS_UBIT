//Assignment Integer Into Binary Part B 
//Roll no = 44

import java.util.Scanner;

public class Assignment_Part_B {

    public static int[] convertToBinary(int num) {

        if (num == 0) {
            return new int[]{0};
        }

        int copy = num;
        int length = 0;

        while (copy > 0) {
            length++;
            copy = copy / 2;
        }

        int[] binaryArray = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            binaryArray[i] = num % 2;
            num = num / 2;
        }

        return binaryArray;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] binary = convertToBinary(number);

        System.out.print("Binary Representation: ");

        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]);
        }

        input.close();
    }
}