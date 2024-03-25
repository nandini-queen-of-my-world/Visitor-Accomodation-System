package Java;
public class Main {
    public static void main(String[] args) {
        /*ctrl+shift+slash=comment lines and again repeat to clear comment lones*/
        //sout+tab=system.out.println()

        //hello world
        /* String name = "HELLO WORLD!";
           System.out.println(name);  */    

  /*    int a = 45;
        float b = 42.22f;
        boolean isAdult=false;
        byte u=-56; *//*byte (-128 to 127)*//*
        char grade ='A'; *//*don't use "" then it becomes sting*//*
            System.out.println(a);
            System.out.println(b);
            System.out.println(isAdult);
            System.out.println(u);
            System.out.println(grade);
         outputs
        45
        42.22
        false
        -56
        A                 */

   /*   int n1=45,n2=78;
        System.out.print("the value of n1+n2 is ");
        System.out.println(n1+n2);
        System.out.print("the value of n1-n2 is ");
        System.out.println(n1-n2);
        System.out.print("the value of n1*n2 is ");
        System.out.println(n1*n2);
        System.out.print("the value of n1%n2 is ");
        System.out.println(n1%n2);
        System.out.print("the value of n1/n2 is ");
        System.out.println(n1/n2);
        System.out.print("the value of n1++ is ");
        System.out.println(n1++);
        System.out.print("the value of ++n1 is ");*//*n1++ writes n1 first and ++ add 1 to it but ++n1 add 1 to it and then writes the value of n1*//*
        System.out.println(++n1);
        System.out.print("the value of n1-- is ");
        System.out.println(n1--);
        System.out.print("the value of --n1 is ");
        System.out.println(--n1);
        //these are arithemetic operations
        //now assignment operations
        System.out.print("the value of n1+=3 is ");
        System.out.println(n1+=3);
        System.out.print("the value of n2-=8 is ");
        System.out.println(n2-=8);
        System.out.print("the value of n1*=2 is ");
        System.out.println(n1*=2);
        System.out.print("the value of n1/=2 is ");
        System.out.println(n1/=2);
        System.out.print("the value of n1%=2 is ");
        System.out.println(n1%=2);
        //output
        the value of n1+n2 is 123
        the value of n1-n2 is -33
        the value of n1*n2 is 3510
        the value of n1%n2 is 45
        the value of n1/n2 is 0
        the value of n1++ is 45
        the value of ++n1 is 47
        the value of n1-- is 47
        the value of --n1 is 45
        the value of n1+=3 is 48
        the value of n2-=8 is 70
        the value of n1*=2 is 96
        the value of n1/=2 is 48
        the value of n1%=2 is 0      */

        //comparision operators
 /*     ==
        !=(not equals to)
        <,>
        <=
        >=    */

        //logical operators
        // &&,||,!(not--tuue-false,false-true)


        //taking input from user

 /*     Scanner scan=new Scanner(System.in);
        System.out.println("enter input");
        String input=scan.nextLine();    //if you use only next then the output will stop before whilte space
        System.out.println(input);   */    //print ln is for new line

/*      Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int input = scan.nextInt();     //you should use only int values
        System.out.println(input);      // don't use nextLine use nextInt      */

/*      String name="NANDINI";
        String origin = "SRIKALAHASTI";
        System.out.println(name);
        System.out.println(name +  "from" +  origin);
        System.out.println(name +  "from\" "+  origin);
        System.out.println(name +  "from\\" +  origin);//concatenation
        System.out.println(name +  "from\n" +  origin);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("Har"));
        System.out.println(name.contains("NA"));
        System.out.println(name.charAt(2));  // counts from 0--0,1,2,3,4,5,6 NANDINI
        System.out.println(name.endsWith("INI"));
        System.out.println(name.indexOf("INI")); // if we enter rrx rhen the index shown in output is -1
        //Output
                NANDINI
        NANDINIfromSRIKALAHASTI
        NANDINIfrom" SRIKALAHASTI
        NANDINIfrom\SRIKALAHASTI
                NANDINIfrom
        SRIKALAHASTI
        7
        nandini
                NANDINI
        false
        true
        N
        true
        4         */

/*      int n1=4,n2=7;
        System.out.println(Math.max(n1,n2));
        System.out.println(Math.min(n1,n2));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-36));
        System.out.println(Math.abs(6));
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random()); // between 0 and 1
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());  //explore more math functions *****
        //output
        7
        4
        6.0
        36
        6
        0.7498784846223765
        0.6427844113709418
        0.10217274805190524
        4.183820595031463
        5.564605987659359
        4.510094928372402
        6.721697707665749     */


        //consitional statements

/*      Scanner scan = new Scanner(System.in);
        System.out.print("Enter age");
        int age= scan.nextInt();     //we should use only int values
       if (age>20)
       { System.out.println("You are an adult");}
       else if(age>5)
        { System.out.println("You are not a kid");}
       else
       { System.out.println("You are a kid");
         // else if statements end if condition is matched
         //if we have 100 conditional statements and 3rd condition is matches then else if statement don't go for 4th*/

        //switch

/*      Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number");
        int number= scan.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("your number didn't match any cases");}  */

        //loops-while loop

/*      int i=0;
        while (i < 100)
         {
             System.out.println(i);
             i+=1;                   //1,2,3.....99 values     }*/

        //do while loop
 /*      int i=0;
     do{ System.out.println(i);
            i+=1;                   //1,2,3.....9 values  }
         while (i < 10);  */

        //for loop
/*      for (int i = 0; i < 10; i++)
          {
          System.out.println(i);
          } // 0,1,2,3...9 */


/*      for (int i = 0; i < 10; i++)
        if (i>2)
       { break;}   //0,1,
        else { System.out.println(i); }  */


//       for (int i = 0; i < 10; i++)
//         if (i==2){continue;}     //0,1,3,4...9 skip 2 value
//         else {System.out.println(i);}  
    }
}

