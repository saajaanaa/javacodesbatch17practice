package class4;
/*Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */
import java.util.Scanner;

public class Task6Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Name the city you are in");
        String city= input.next();
        System.out.println("What is the temperature in the city");
        double tempF= input.nextDouble();
        double tempC=((tempF-32)*5/9);
        System.out.println("The temperature in the city is " +tempC + "Celsius");

    }
}
