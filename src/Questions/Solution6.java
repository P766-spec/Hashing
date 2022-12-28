package Questions;

import java.util.HashMap;

// Maximum distance between two occurrences of same element in array
public class Solution6 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7 ,4, 2};
        int n = arr.length;
        System.out.println(maxDistance(arr,n));
    }
    static int maxDistance(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_dist = 0;
        for(int i =0; i<n; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],i);
            else
                max_dist = Math.max(max_dist, i - map.get(arr[i]));
        }
        return max_dist;
    }

}
