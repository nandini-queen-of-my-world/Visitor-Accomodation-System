class Solution {
    int[] arr;

    public int[] plusOne(int[] digits) {
        int r,n, sum = 0;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum*10 + digits[i];            
        }
        sum = sum + 1;
while(sum>=0){
    sum=sum/10;
    n++;
}
        for (int i = digits.length - 1; i >= 0; i--) {
            r = sum % 10;
            arr[i] = r;
            sum = sum / 10;
        }

        return arr;
    }

plusOne([1,2,3]);
}