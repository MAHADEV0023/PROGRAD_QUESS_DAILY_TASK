public class Task9 {
    public static char findMissingLetter(char[] array){
        char letters= array[0];
        for(char letter : array)
        {
            if(letter!= letters)
                break;
            letters++;

        }
        return letters;
    }
    public static void main(String[] args) {

    }
}
