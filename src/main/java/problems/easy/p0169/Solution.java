package problems.easy.p0169;

//Given an array nums of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,3]
//        Output: 3
//        Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 5 * 104
//        -109 <= nums[i] <= 109
//
//
//        Follow-up: Could you solve the problem in linear time and in O(1) space?

public class Solution {
    public int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        int n = nums.length;

        //Moores voting Alg
        for (int num : nums) {
            if (count == 0) {
                count = 1;
                major = num;
            } else if (major == num) {
                count++;
            } else {
                count--;
            }
        }

        // checking majority
        count = 0;
        for (int num:
             nums) {
            if (num == major) count++;
        }

        if (count > (n/2)) return major;

        return Integer.MIN_VALUE;
    }
}
