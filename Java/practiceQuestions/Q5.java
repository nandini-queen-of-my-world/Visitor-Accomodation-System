package Java.practiceQuestions;
import java.util.Scanner;
/*Write a menu driven program to do the following .Using a constructor initialize 
a matrix with the data being read from the user.
a. Find the sum of diagonal elements
b. Find the number of even numbers in the matrix. */
public class Q5 {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Q5(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public int getSumOfDiagonal() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int getNumberOfEvenNumbers() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        Q5 matrixObj = new Q5(rows, cols);

        int choice;
        do {
            System.out.println("\nMatrix Operations");
            System.out.println("1. Find sum of diagonal elements");
            System.out.println("2. Find number of even numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum of diagonal elements: " + matrixObj.getSumOfDiagonal());
                    break;
                case 2:
                    System.out.println("Number of even numbers: " + matrixObj.getNumberOfEvenNumbers());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
