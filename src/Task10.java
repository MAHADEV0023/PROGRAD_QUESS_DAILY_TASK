public class Task10 {
    public static String disemvowel(String str) {
        return str.replaceAll("[aioueAIOUE]","");
    }
    public static void main(String[] args) {
        disemvowel("This website is for losers LOL!" );

    }
}
