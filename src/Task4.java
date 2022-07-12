public class Task4 {
    public static long sumCubes(long n){
        long sum = 0;
        for (long x = 1; x <= n; x++)
            sum += x * x * x;
        return sum;
    }
    public static void main(String[] args) {
        sumCubes(3);
    }
}
