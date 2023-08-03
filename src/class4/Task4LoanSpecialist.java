package class4;
/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the clien
 */

public class Task4LoanSpecialist {
    public static void main(String[] args) {
        int loan=200000;
        if(loan==200000){
            System.out.println("You would lend the money");
        }else{
            System.out.println("You would reject the client");
        }
    }
}
