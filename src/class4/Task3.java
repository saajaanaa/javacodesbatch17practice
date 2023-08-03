package class4;
/*Create a Java program and call it a Donor.
In order to be eligible to donate your blood you have to be 18 years old.
Also once you identify age eligibility then we have to see if person matches weight requirements.
If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.
 */
public class Task3 {
    public static void main(String[] args) {

        int age=25;
        double weight=135.60;

        if(age>=18){
            System.out.println("Eligible to donate your blood");

        }else{
            System.out.println("Not eligible to donate your blood");
        }
        if(weight>=110){
            System.out.println("He/she will be eligible");
        }else{
            System.out.println("we cannot accept such a patient");
        }

    }
}
