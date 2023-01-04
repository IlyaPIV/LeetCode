package problems.easy.p1342;

public class BinarySolution {
    public int numberOfSteps (int num) {
        return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
    }
}

