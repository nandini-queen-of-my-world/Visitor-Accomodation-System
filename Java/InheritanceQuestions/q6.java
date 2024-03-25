package Java.InheritanceQuestions;
/*Write a java program to add two integers and two float numbers. When no arguments are
supplied, give a default value to calculate the sum. Use function overloading. [Method
Overloading] */
public class q6{    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        float float1 = 1.5f;
        float float2 = 2.5f;
        
        // Method calls with arguments
        int sumInt = add(num1, num2);
        float sumFloat = add(float1, float2);
        
        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of floats: " + sumFloat);
        
        // Method calls with no arguments
        int defaultSumInt = add();
        float defaultSumFloat = add(0.5f, 1.0f); // changed parameter types
        
        System.out.println("Default sum of integers: " + defaultSumInt);
        System.out.println("Default sum of floats: " + defaultSumFloat);
    }
    
    // Method overloading for adding two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method overloading for adding two float numbers
    public static float add(float num1, float num2) {
        return num1 + num2;
    }
    
    // Method overloading for adding default values (no arguments)
    public static int add() {
        int num1 = 5;
        int num2 = 10;
        return num1 + num2;
    }
    
    // Method overloading for adding default values (different parameter types)
    public static float add(float num1, int num2) {
        float num3 = 0.5f;
        return num1 + num2 + num3;
    }
}
