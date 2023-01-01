package Questions;
import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/word-pattern/

public class Solution10 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        Map i = new HashMap();
        for(Integer i =0; i<words.length; i++)
            if(i.put(pattern.charAt(i), i) != i.put(words[i],i))
                return false;
            return true;
        
    }
}
