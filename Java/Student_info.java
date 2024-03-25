package Java;
import java.util.Scanner;
class student{
    int age,dob,height;
    String gender,acheivements,personal_info,input;
    void details(){
        System.out.println("Name = "+input);
        System.out.println("age of "+input+" = "+age);
        System.out.println("date of birth of "+input+ " = "+dob );
        System.out.println("gender = "+gender);
        System.out.println("acheivements of "+input+" = "+acheivements);
        System.out.println("height of "+input+" = "+height);
        System.out.println("personal information of "+input+" = "+personal_info);
    }
}
public class Student_info {
    public static void main(String[] args) {
        student object1 = new student();
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your name");
        object1.input=scan.nextLine();
        System.out.println("please enter your gender");
        object1.gender=scan.nextLine();
        System.out.println("please add your acheivements if any...");
        object1.acheivements=scan.nextLine();
        System.out.println("please enter your personal information if u like to");
        object1.personal_info=scan.nextLine();
        System.out.println("please enter your age");
        object1.age=scan.nextInt();
        System.out.println("please enter your date of birth");
        object1.dob=scan.nextInt();
        object1.height=6;
        /* System.out.println("please enter your height");
        object1.height=scan.nextInt(); */
        object1.details();
    }
}
