package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the scanner class so thet we can reuse the logic from
        //this class which is already written for us by java developers.
        Scanner input=new Scanner(System.in);
        String name= input.next();
        if(name=="Sajana"){
            System.out.println("Java Instructor");
        }else{
            System.out.println("I don't know you");
        }
       // System.out.println("Hello "+name);

    }
}
