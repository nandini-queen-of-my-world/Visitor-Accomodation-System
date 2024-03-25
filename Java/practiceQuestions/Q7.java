package Java.practiceQuestions;

/*Write a Java program to create a class called "Q7" with attributes for menu items, prices, 
and ratings, and methods to add and remove items, and to calculate average rating.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Q7 {
     private ArrayList<String> menuItems;
     private ArrayList<Double> prices;
     private ArrayList<Integer> ratings;
 
     public Q7() {
         menuItems = new ArrayList<>();
         prices = new ArrayList<>();
         ratings = new ArrayList<>();
     }
 
     public void addItem(String item, double price, int rating) {
         menuItems.add(item);
         prices.add(price);
         ratings.add(rating);
         System.out.println("Item " + item + " added successfully.");
     }
 
     public void removeItem(String item) {
         int index = menuItems.indexOf(item);
         if (index >= 0) {
             menuItems.remove(index);
             prices.remove(index);
             ratings.remove(index);
             System.out.println("Item " + item + " removed successfully.");
         } else {
             System.out.println("Item " + item + " not found.");
         }
     }
 
     public double calculateAverageRating() {
         if (ratings.size() == 0) {
             return 0;
         }
         int sum = 0;
         for (int rating : ratings) {
             sum += rating;
         }
         return (double) sum / ratings.size();
     }
 
     public static void main(String[] args) {
         Q7 Q7Obj = new Q7();
         Scanner sc = new Scanner(System.in);
 
         int choice;
         do {
             System.out.println("\nQ7 Management");
             System.out.println("1. Add item");
             System.out.println("2. Remove item");
             System.out.println("3. Calculate average rating");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
             sc.nextLine();  // consume the new line character
 
             switch (choice) {
                 case 1:
                     System.out.print("Enter item name: ");
                     String item = sc.nextLine();
                     System.out.print("Enter item price: ");
                     double price = sc.nextDouble();
                     System.out.print("Enter item rating: ");
                     int rating = sc.nextInt();
                     Q7Obj.addItem(item, price, rating);
                     break;
                 case 2:
                     System.out.print("Enter item name: ");
                     item = sc.nextLine();
                     Q7Obj.removeItem(item);
                     break;
                 case 3:
                     double avgRating = Q7Obj.calculateAverageRating();
                     System.out.println("Average rating: " + avgRating);
                     break;
                 case 4:
                     System.out.println("Exiting...");
                     break;
                 default:
                     System.out.println("Invalid choice");
             }
         } while (choice != 4);
     }
 }
 