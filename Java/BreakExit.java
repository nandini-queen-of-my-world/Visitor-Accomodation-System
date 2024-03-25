package Java;
public class BreakExit{
    public static void main(String[] args){
        int i;
        System.out.println("the use of exit");
        for(i=1;i<5;i++){
            if(i%3 ==0)
                break;
            else
                System.out.println(i);
        }
        System.out.println("The use of continue");
        for(i=1;i<5;i++){
            if(i%3 ==0)
                continue;
            else
                System.out.println(i);

        }
    }

    }
