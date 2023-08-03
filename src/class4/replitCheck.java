package class4;

import java.util.Scanner;

public class replitCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");

        System.out.println("Enter your mobile number");

        System.out.println("Enter your age");
        String name = input.next();
        String phoneNumber = input.next();
        int age = input.nextInt();
        System.out.println(" Your name is " + name + ", your age is " + age + " and your mobile is " + phoneNumber);
    }
}
