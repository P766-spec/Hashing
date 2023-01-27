package Questions;
// https://leetcode.com/problems/concatenated-words/
import java.util.*;

public class Solution13 {
    public static void main(String[] args) {
        String[] words ={ "cat", "dog", "catdog"};
        System.out.println(findAllConcatenatedWordsInADict(words));
    }
    static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String>cw=new ArrayList<>();
        Set<String>hs=new HashSet<>();
        for(String i:words) hs.add(i);
        Map<String,Integer>hm=new HashMap<>();
        for(String i:words) if(check(i,hs,hm)) cw.add(i);
        return cw;
    }
    public static boolean check(String i,Set<String>hs,Map<String,Integer>hm){
        if(hm.containsKey(i)) return hm.get(i)==1;
        for(int z=0;z<i.length();z++){
            if(hs.contains(i.substring(0,z))){
                String s1=i.substring(z);
                if(hs.contains(s1)||check(s1,hs,hm)){
                    hm.put(i,1);
                    return true;
                }
            }
        }
        hm.put(i,0);
        return false;
    }
}
