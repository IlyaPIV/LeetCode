package codility.task3;

public class TaskThree {

    public static int solution(int A, int B) {
        // Implement your solution here
        int minVal = Math.min(A, B);
        int maxVal = Math.max(A, B);
        int cf = maxVal / minVal;
        System.out.printf("A=%d; B=%d; coefficient A/B = %d\n", A, B, cf);
        if (cf == 1) return minVal / 2;
        else if (cf < 4) {
            return maxVal / 3;
        } else return maxVal / 4;

    }

    public static void main(String[] args) {
        System.out.println(solution(10, 21));
        System.out.println(solution(13, 11));
        System.out.println(solution(1, 2));
        System.out.println(solution(1, 3));
        System.out.println(solution(1, 8));
        System.out.println(solution(1, 9));
        System.out.println(solution(50, 50));
        System.out.println(solution(49, 49));
    }
}
