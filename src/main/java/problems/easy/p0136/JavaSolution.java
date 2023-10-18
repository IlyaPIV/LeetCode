package problems.easy.p0136;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaSolution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> appearance = new HashMap<>();
        for (int num:
             nums) {
            appearance.put(num, appearance.getOrDefault(num, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = appearance.entrySet();
        for (Map.Entry<Integer, Integer> pair:
             entries) {
            if (pair.getValue() == 1) {
                return pair.getKey();
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int res = JavaSolution.singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println(res);
    }
}
