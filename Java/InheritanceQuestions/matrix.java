package Java.InheritanceQuestions;
import java.util.Scanner;

public class matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public matrix(int rows, int cols) {
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

    public int getSum() {
        int sum = 0;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of i");
        k=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public void makeEvenNumbers_zero() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] =0;
                }
            }
        }
       
    }
    public int sumMatrix(){
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        matrix matrixObj = new matrix(rows, cols);

        int choice;
        do {
            System.out.println("\nMatrix Operations");
            System.out.println("1. Find sum of ith row and column");
            System.out.println("2. make even numbers zero");
            System.out.println("3. sum of matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum of ith row and column elements: " + matrixObj.getSum());
                    break;
                case 2:
                matrixObj.makeEvenNumbers_zero();
                System.out.println("All even numbers are made zeros!!");
                break;
                case 3:
                    System.out.println("Sum of all elements: " + matrixObj.sumMatrix());
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
