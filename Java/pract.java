package Java;
import java.util.Scanner;
public class pract {
    public static void main(String[] args) {
        int n1 = 45, n2 = 78;
        System.out.print("the value of n1+n2 is ");
        System.out.println(n1+n2);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter input");
        String input=scan.nextLine();    //if you use only next then the output will stop before whilte space
        System.out.println(input);

    }
}
