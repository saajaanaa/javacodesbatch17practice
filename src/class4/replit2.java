package class4;

import java.util.Scanner;

public class replit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive");
            if (num == 0) {
                System.out.println("Entered number is equal to 0");
            } else {
                System.out.println(num + " is negative");


            }
        }
    }
}
