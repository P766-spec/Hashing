package Questions;
import java.util.Arrays;
import java.util.HashSet;

// Find missing elements of a range
public class Soultion7 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, };
        int low = 1;
        int high = 10;
        printMissing(arr,low,high);
    }
    static void printMissing(int[] arr, int low, int high){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        for(int i = low; i <= high; i++){
            if(!hs.contains(i)) {
                System.out.println(i + " ");
            }
        }
    }

}
