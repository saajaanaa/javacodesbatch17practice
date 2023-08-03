package class4;
/*Create a Java program that will ask if user has a credit card or not. If you user does not have a credit
card then offer them. If they do have one ask what is balance on the card? If balance of the card is larger
than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more
 */
import java.util.Scanner;

public class Task7CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card? Y/N");
        String credit = input.next();
        if (credit.equals("Y")) {
            System.out.println("What is the balance of your card?");
            int balance = input.nextInt();
            if (balance > 1000) {
                System.out.println("Pay off the balance immediately");
            } else {
                System.out.println("You can spend more");
            }
        } else {
            System.out.println("Would you like to apply for a credit card?");
            String response = input.next();
            if (response.equals("Y")) {
                System.out.println("Transferring you to credit card application portal. Please wait...");
            } else {
                System.out.println("Thank you and good bye!");
            }
        }
    }
}
