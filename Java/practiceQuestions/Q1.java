package Java.practiceQuestions;
import java.util.Scanner;  
//import java.util.Arrays;
/*SORTING ARRAYS */
public class Q1 {
    
           public static void main(String[] args) {
            // int i=0, sum=0;
            // int[] arr = new int[]{2,4,5,3,7,6,9,10,1,8};
            // int temp=0;
            // for(i=0;i<10;i++){
            //     for(int j=i+1;j<10;j++) {
            //         if (arr[i] < arr[j]) {
            //             temp = arr[i];
            //             arr[i]=arr[j];
            //             arr[j] = temp;
            //         }
            //     }
            // }
            // for(i=0;i<10;i++) {
            //     System.out.print(arr[i]+" ");
            // }

        /*     int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  */
int m, n, i, j;   
Scanner sc=new Scanner(System.in);   
System.out.print("Enter the number of rows: ");   
m = sc.nextInt();   
System.out.print("Enter the number of columns: ");   
n = sc.nextInt();   
int array[][] = new int[m][n];    
System.out.println("Enter the elements of the array: ");   
for (i = 0; i < m; i++)   
for (j = 0; j < n; j++)   
array[i][j] = sc.nextInt();   
//accessing array elements   
System.out.println("Elements of the array are: ");   
for (i = 0; i < m; i++)   
{   
for (j = 0; j < n; j++)   
//prints the array elements  
System.out.print(array[i][j] + " ");   
//throws the cursor to the next line  
System.out.println();   
}   
            /***using sort()***/
            /*int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
            System.out.println("The original array is: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            Arrays.sort(arr);
            System.out.println("\nThe sorted array is: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }*/


        /*    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };  
        Arrays.sort(arr);
        System.out.println("Modified arr[] : "+ Arrays.toString(arr));*/ 

          // only sort subarray {7, 6, 45, 21} 
        /*    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };  
        Arrays.sort(arr,1,5);
        System.out.println("Modified arr[] : "+ Arrays.toString(arr));*/ 

        
            }
        }
        
    

