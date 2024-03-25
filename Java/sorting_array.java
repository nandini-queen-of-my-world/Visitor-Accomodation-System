package Java;
public class sorting_array {
    public static void main(String[] args) {
        int i=0, sum=0;
        int[] arr = new int[]{2,4,5,3,7,6,9,10,1,8};
        int temp=0;
        for(i=0;i<10;i++){
            for(int j=i+1;j<10;j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<10;i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    }
