package problems.easy.p2614;

public class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime = 0;

        for (int i = 0; i < nums.length; i++) {
            int mainD = nums[i][i];
            int revD = nums[i][nums.length - i - 1];

            prime = checkPrime(mainD) ? (Math.max(mainD, prime)) : prime;
            prime = checkPrime(revD) ? (Math.max(revD, prime)) : prime;
        }

        return prime;
    }

    private boolean checkPrime(int num){
        if (num == 1) return false;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] nums = {{1, 2, 3},
                        {5, 6, 7},
                        {9, 10, 11}};

        System.out.println(sol.diagonalPrime(nums));
    }
}
