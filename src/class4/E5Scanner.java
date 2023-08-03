package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your age");
        int age=scanner.nextInt();
        System.out.println("Your Age is "+age);

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName=input.next();
        System.out.println("Please Enter Last Name");
        String lastName=input.next();

    }
}
