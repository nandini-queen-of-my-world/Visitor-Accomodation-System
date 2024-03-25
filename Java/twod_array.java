package Java;
public class twod_array {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr = new int[][]{ {1, 2}, {3, 4} };
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                sum = sum + arr[i][j];

        }
        System.out.println("sum is "+sum);
    }
}
