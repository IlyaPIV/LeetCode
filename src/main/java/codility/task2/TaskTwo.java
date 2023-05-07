package codility.task2;

public class TaskTwo {

    static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            //if (nX == nY)
            if ((nX == nY) || (X == Y))
                result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 42, 11, 7, 1, 42};
        System.out.println(solution(7, 42, arr)); //4
        int[] arr2 = new int[]{100, 63, 1, 6, 2, 13};
        System.out.println(solution(100, 63, arr2)); //5
        int[] arr3 = new int[]{13, 13, 1, 6};
        System.out.println(solution(6, 13, arr3)); //-1
        System.out.println(solution(13, 13, arr3)); //3
    }
}
