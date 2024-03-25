package Java;
import java.util.*;
public class Calcy_ifelse {
    public static void main(String[] args){
        int num1,num2;
        String input,add,sub,mul,div;
Scanner scan =new Scanner(System.in);
        System.out.println("enter first number");
        num1=scan.nextInt();
        System.out.println("enter second number");
        num2=scan.nextInt();
        System.out.println("enter the operation to perform(add,sub,mul,div)");
        input=scan.next();

        switch (input) {
            case "add" -> {
                int a = num1 + num2;
                System.out.println("num1+num2=" + a);
            }
            case "sub" -> {
                int b = num1 - num2;
                System.out.println("num1-num2=" + b);
            }
            case "mul" -> {
                if(num1!=0 && num2!=0){
                int c = num1 * num2;
                System.out.println("num1*num2=" + c);}
                else{
                    System.out.println("plz don't enter 0 as input");
                }
            }
            case "div" -> {
                if(num1!=0 && num2!=0){
                float d = (float)num1/ num2;
                System.out.println("num1/num2=" + d);}
                else{
                    System.out.println("plz don't enter 0 as input");
                }
            }
            default -> {
                System.out.println("invalid input!!!! plz try again....");
            }
        }
    }

}
