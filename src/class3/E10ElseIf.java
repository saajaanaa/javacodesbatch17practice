package class3;

public class E10ElseIf {
    public static void main(String[] args) {
        String fruit="Apple";

        if(fruit.equals("Mango")){
            System.out.println("Price is $5");
        }else if(fruit.equals("orange")){
            System.out.println("price is $4");
        }else if(fruit.equals("Apple")){
            System.out.println("Price is $1000");
        }else if(fruit.equals("Kiwi")){
            System.out.println("prive is $6");

        }else{
            System.out.println("This Fruit isn't available right now");
        }
    }
}
