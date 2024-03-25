package Java.practiceQuestions;

public class exception_handling {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        int den[]={2,0,3};
        for(int i=0; i<num.length; i++) {
            try{
                System.out.println(num[i]/den[i]);
            }
            catch(ArithmeticException Ex){
                System.out.println("Division with 0");
            }
            catch(Exception Ex){
                System.out.println("No element to devide");
            }
    }
}
}