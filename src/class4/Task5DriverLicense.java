package class4;
/*You are DMV representative and you need to ask customer their age. If they are 18 and older
you will issue a driver license to them, otherwise you will offer them to get a learners permit.
 */

public class Task5DriverLicense {
    public static void main(String[] args) {
        int age=35;
        if(age>=18){
            System.out.println("You will issue a driver license");
        }else {
                System.out.println("You will offer them to get a learners Permit");
        }
    }
}
