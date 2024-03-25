package Java;
public class change_to_double {
    public static void main(String[] args) {
        // float to double
        float a, b;
        a = 25.5f;
        b = 40.3f;
        double avg_ab =(double)(a+b)/2;
        System.out.println("average:float to double="+avg_ab);

        // double to float
        double j, k;
        j = 25.5f;
        k = 40.3f;
        float avg_jk =(float)(j+k)/2;
        System.out.println("\naverage:double to float="+avg_jk);

        // double to int
        double u;
        int i;
        u=13;
        i=(int)u/2;
        System.out.println("double to int="+i);

        //int to char
        char ch;
        ch=(int)89;
        System.out.println("int to char is "+ch);

        //int to byte
        byte f;
        f=(byte)500;
        System.out.println("int to byte is"+f);
    }
}
