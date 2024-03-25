package Java.practiceQuestions;
import java.util.Scanner;
/*Write a java program to search for an element in an array.Use getdata() to get the item to be searched.Use search(item) to search and display the status */
public class Q2 {

    public int[] arr={1,2,3,4,5,6,7,8,9,10};
   public int item;

    public int getData() {
        System.out.println("Enter element to search:");
        Scanner scan = new Scanner(System.in);
       item= scan.nextInt();
        return item;
    }

    public boolean search(int item) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Q2 arraySearch = new Q2();       
        int item = arraySearch.getData();        
        if (arraySearch.search(item)) {
            System.out.println("Item found in array.");
        } else {
            System.out.println("Item not found in array.");
        }
    }
}


