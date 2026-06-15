//Assignment Integer Into Binary Part C
//Roll no = 44

import java.util.Scanner;

public class Assignment_Part_C {

    public static String convertToBinary(int num) {

        if (num == 0) {
            return "0";
        }

        String result = "";

        while (num > 0) {
            result = (num % 2) + result;
            num = num / 2;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String binary = convertToBinary(number);

        System.out.println(number + " in binary = " + binary);

        input.close();
    }
}