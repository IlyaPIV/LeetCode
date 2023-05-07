package codility.task1;

import java.util.Random;
import java.util.Arrays;

public class TaskOne {
    // task 1
    public static int[] solution(int N) {
        // Implement your solution here
        int[] newArr = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            newArr[i] = rnd.nextInt(1000-1) + 1;
        }

        return newArr;
    }

    static int find_min(int[] A) {
        int and = 0;
        for (int i = 1; i < A.length; i++) {
            if (and > A[i]) {
                and = A[i];
            }
        }
        return and;
    }
    public static void main(String[] args) {
        int[] arr = solution(4);
        System.out.println(Arrays.toString(arr));
        System.out.println(find_min(arr));
        int[] arr2 = new int[]{3, -2, 197, 36, -5, -4};
        System.out.println(find_min(arr2));

    }
}
