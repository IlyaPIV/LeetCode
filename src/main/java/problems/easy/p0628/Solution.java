package problems.easy.p0628;

//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//
//
//        Example 1:
//        Input: nums = [1,2,3]
//        Output: 6
//
//        Example 2:
//        Input: nums = [1,2,3,4]
//        Output: 24
//
//        Example 3:
//        Input: nums = [-1,-2,-3]
//        Output: -6
//
//
//        Constraints:
//
//        3 <= nums.length <= 104
//        -1000 <= nums[i] <= 1000

public class Solution {
    public int maximumProduct(int[] nums) {
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            //Updating maximums
            if (max1 < num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 < num) {
                max3 = max2;
                max2 = num;
            } else if (max3 < num) {
                max3 = num;
            }

            //Updating minimums
            if (min1 > num) {
                min2 = min1;
                min1 = num;
            } else if (min2 > num) {
                min2 = num;
            }

        }

        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);
    }
}
