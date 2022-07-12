public class Task2 {
    public static long numberOfDivisors(int n) {
        long count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        numberOfDivisors( 4);
    }
}
