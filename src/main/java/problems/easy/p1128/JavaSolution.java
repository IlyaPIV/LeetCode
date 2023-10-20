package problems.easy.p1128;

import java.util.HashMap;

public class JavaSolution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[99];
        int res = 0;
        for (int[] pair: dominoes) {
            int greater = Math.max(pair[0], pair[1]);
            int lesser = Math.min(pair[0], pair[1]);
            res += count[greater*10 + lesser]++;
        }
        return res;

    }
}
