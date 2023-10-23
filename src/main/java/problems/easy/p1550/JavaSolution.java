package problems.easy.p1550;

public class JavaSolution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int first = 0;
        int second = 0;
        int third = 0;
        for (int val:
             arr) {

            if (val % 2 == 0) {
                first = 0;
                second = 0;
                third = 0;
            } else {
                third = second;
                second = first;
                first = val;
            }
            if (third != 0) return true;
        }
        return false;
    }
}
