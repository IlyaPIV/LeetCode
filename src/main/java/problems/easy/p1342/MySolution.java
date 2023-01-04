package problems.easy.p1342;

public class MySolution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            steps++;
        }

        return steps;
    }
}

// Time Complexity: O(logn)
// Space Complexity: O(1)
