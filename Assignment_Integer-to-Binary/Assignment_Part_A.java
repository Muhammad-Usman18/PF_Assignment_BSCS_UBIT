//Assignment Integer Into Binary Part A
//Roll no = 44
import java.util.Scanner;

public class Assignment_Part_A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = input.nextInt();

        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        System.out.println("Binary Number = " + binary);

        input.close();
    }
}

//    Test Cases   
// (1) Input = 32 / Output = 100000
// (2) Input = 27 / Output = 11011
// (3) Input = 26 / Output = 11010
