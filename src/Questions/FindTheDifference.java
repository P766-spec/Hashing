package Questions;

import java.util.*;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/
public class FindTheDifference {
  public static void main(String[] args) {
   int[] nums1 = {1, 2, 3};
   int[] nums2 = { 2, 4, 6};
   System.out.println(findDifference(nums1, nums2));

  }
  static  List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
   Set<Integer>  set1 = new HashSet<>(), set2 = new HashSet<>();
   for(int n : nums1) {
    set1.add(n);
   }
   for(int n : nums2) {
    set2.add(n);
   }
   Set<Integer> copy = new HashSet<>(set1);
   set1.removeAll(set2);
   set2.removeAll(copy);

   return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));

  }
}
