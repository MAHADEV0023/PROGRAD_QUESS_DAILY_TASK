public class Task3 {
    public static int digital_root(int n) {
        int i=n;
        if(i/10==0){return i;}
        else{int sum=0;
            while(i>0){
                sum+=i%10;
                i/=10;
            }
            return digital_root(sum);
        }
    }
    public static void main(String[] args) {
        digital_root(232);
    }
}
