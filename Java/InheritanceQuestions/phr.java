package Java.InheritanceQuestions;

import java.util.Scanner;

public class phr {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
            
                if(x<99){
                System.out.println(s1+"     "+"0"+x);}
                else{
                System.out.println(s1+"       "+x);}
               
                }
            
            System.out.println("================================");

    }
}

