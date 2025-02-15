/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.HashMap;
import java.util.Map;

class Solution{
    public int[] twoSum( int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)) {

                return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");

    }
        public static void main (String[] args) {
            Solution solution = new Solution();
            
// Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}