package Questions;
// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
import java.util.HashMap;
import java.util.Map;

public class Solution11 {
    public static void main(String[] args) {
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(tasks));
    }
    static  int minimumRounds(int[] tasks) {
        Map<Integer, Integer> f = new HashMap<>();
        for(int  task : tasks) {
            f.put(task, f.getOrDefault(task,0) + 1);
        }
        int min_rounds = 0;
        for(int count : f.values()) {
            if(count == 1){
                return -1;
            }
            if(count % 3 == 0){
                min_rounds += count /3;
            } else {
                min_rounds += count / 3  +1;
            }
        }
        return min_rounds;
    }
}
