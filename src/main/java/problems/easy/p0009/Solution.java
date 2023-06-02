package problems.easy.p0009;
//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
// Example 1:
//
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//
// Example 2:
//
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it
//becomes 121-. Therefore it is not a palindrome.
//
//
// Example 3:
//
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//
// Constraints:
//
//
// -2³¹ <= x <= 2³¹ - 1
//
//
//
//Follow up: Could you solve it without converting the integer to a string?
//
// Related Topics Math
// 👍 9717 👎 2516


import java.util.stream.Stream;

////leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        String origin = String.valueOf(x);
        StringBuilder sb = new StringBuilder(origin);
        sb.reverse();
        String reverse = sb.toString();
        return origin.equals(reverse);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
