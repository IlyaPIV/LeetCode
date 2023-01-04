package problems.easy.p1672;

public class MySolution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            if (temp > max) max = temp;
        }
        return max;
    }
}
