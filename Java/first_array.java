package Java;
public class first_array {
    public static void main(String[] args) {
        int i=0, sum=0;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(i=0;i<10;i++)
        {
            sum += arr[i];
        }
        System.out.println("sum is "+sum);
    }
}
