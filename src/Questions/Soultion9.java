package Questions;
import java.util.Arrays;
// Most frequent element in an array

public class Soultion9 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 20, 20, 20, 10};
        int n = arr.length;
        System.out.println(mostFrequent(arr,n));
    }
    static int mostFrequent(int[] arr, int n) {
        Arrays.sort(arr);
        int max_count = 1;
        int ans = arr[0];
        int curr_count = 1;

        for (int i =1; i<n ;i++){
            if(arr[i] == arr[i-1])
                curr_count++;
            else
                curr_count = 1;
            if(curr_count > max_count){
                max_count = curr_count;
                ans = arr[i-1];
            }
        }
        return ans;
    }
}
