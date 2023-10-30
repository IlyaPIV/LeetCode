package problems.easy.p1137;

public class JavaSolution {
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int[] sequence = new int[n+1];
        sequence[0] = 0;
        sequence[1] = 1;
        sequence[2] = 1;
        for(int i = 3; i < n+1; i++){
            sequence[i] = sequence[i-1] + sequence[i-2] + sequence[i-3];
        }
        return sequence[n];
    }


}
