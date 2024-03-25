package Java;
public class add_matrix {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2}, {3, 4}};
        int[][] arr2 = new int[][]{{5, 7}, {6, 8}};
        int[][] sum = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                sum[i][j] = arr1[i][j] + arr2[i][j];

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
