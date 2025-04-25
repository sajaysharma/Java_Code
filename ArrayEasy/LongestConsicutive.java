/*
 * 128. Longest Consecutive Sequence
Medium
Topics
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3

 */

import java.util.HashSet;

import java.util.Set;
public class LongestConsicutive {
        public static void longest(int[] nums) {
            
            if(nums.length == 0) return;
    
            Set<Integer> set = new HashSet<>();
            int longest = 1;
            // int lastSmaller = 1;
            for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
            }
            for(int it : set){
                if(!set.contains(it - 1)){
                     int count = 1;
                     int x = it;
                     while(set.contains(x + 1)) {
                        x = x + 1;
                        count += 1;
                     }
                     longest = Math.max(longest, count);
                }
            }
            
            System.out.println(longest);;
        
    }

    public static void main(String[] args) {
     
        int []arr = {100,4,200,1,3,2};

        longest(arr);
    }
}
