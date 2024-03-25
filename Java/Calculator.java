package Java;
class calsi{
    int num1,num2;
    void cal() {
        int add= num1+num2,sub=num1-num2,mul=num1*num2,div=num1/num2;
        System.out.println("add="+add);
        System.out.println("sub="+sub);
        System.out.println("multiply="+mul);
        System.out.println("divide="+div);
    }
 }
public class Calculator {
    public static void main(String[] args) {
        calsi object1 = new calsi();
        object1.num1 = 10;
        object1.num2 = 20;
        object1.cal();
    }
}
