//package Questions;
//
//import java.util.HashMap;
//import java.util.Map;
//// https://leetcode.com/problems/verifying-an-alien-dictionary/
//
//public class Solution14 {
//    public static void main(String[] args) {
//        String[] words = {"hello", "leetcode"};
//        String order = "hlabcdefgijkmnopqrstuvwxyz";
//        System.out.println(isAlienSorted(words, order));
//    }
//
//    static boolean isAlienSorted(String[] words, String order) {
//        Map<Character, Integer> mp;
//        mp = new HashMap<>();
//        for (int i = 0; i < order.length(); i++) {
//            mp.put(order.charAt(i), i);
//        }
//        for (int i = 0; i < words.length - 1; i++) {
//            if (!compare(words[i], words[i + 1])) return false;
//        }
//        return true;
//    }
//
//    static boolean compare(String s1, String s2) {
//
//        int l1 = s1.length(), l2 = s2.length();
//        for (int i = 0, j = 0; i < l1 && j < l2; i++, j++) {
//            if (s1.charAt(i) != s2.charAt(j)) {
//                if (mp.get(s1.charAt(i)) > mp.get(s2.charAt(j))) {
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//        }
//        if (l1 > l2) return false;
//        return true;
//    }
//}
