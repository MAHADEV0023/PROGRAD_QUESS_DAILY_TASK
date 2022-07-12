public class Task1 {
    public static int GetSum(int a, int b)
    {
        int max =Math.max(a, b);
        int min =Math.min(a, b);


        return (max-min +1)*(min+max)/2;
    }
    public static void main(String[] args) {
        GetSum(10,20);

    }
}
