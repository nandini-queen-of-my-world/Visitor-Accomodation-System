package Java.practiceQuestions;
/*Write a menu driven program to do the following.Each should be done by separate functions. 
Initialize two double variables and the char operator using constructor
a. Add()
b.Substract() 
c. Divide() 
d.Multiply() */
import java.util.Scanner;

public class Q4 {
    private double var1;
    private double var2;
    private char operator;

    public Q4(double var1, double var2, char operator) {
        this.var1 = var1;
        this.var2 = var2;
        this.operator = operator;
    }

    public double add() {
        return var1 + var2;
    }

    public double subtract() {
        return var1 - var2;
    }

    public double divide() {
        if (var2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return var1 / var2;
    }

    public double multiply() {
        return var1 * var2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first variable: ");
        double var1 = sc.nextDouble();
        System.out.print("Enter second variable: ");
        double var2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        Q4 calc = new Q4(var1, var2, operator);

        switch (operator) {
            case '+':
                System.out.println("Result: " + calc.add());
                break;
            case '-':
                System.out.println("Result: " + calc.subtract());
                break;
            case '*':
                System.out.println("Result: " + calc.multiply());
                break;
            case '/':
                try {
                    System.out.println("Result: " + calc.divide());
                } 
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

