package Java.InheritanceQuestions;
/*Write a Java program that counts the number of objects created by using static variable. */

public class q3 {
    private static int count = 0; // static variable to count the number of objects
    private int id; // instance variable to store the id of the object
    
    public q3() {
        count++; // increment the counter when an object is created
        id = count; // assign the current count value to the object's id
    }
    
    public static int getCount() {
        return count;
    }    
    public static void main(String[] args) {
        q3 obj1 = new q3();
        q3 obj2 = new q3();
        q3 obj3 = new q3();        
        System.out.println("Number of objects created: " + q3.getCount());        
    }
}

