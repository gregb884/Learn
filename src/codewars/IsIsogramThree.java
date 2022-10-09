package codewars;

public class IsIsogramThree {

    public static boolean checkWordIsAnIsogram(String word) {
        return word.length() == word.toLowerCase().chars().distinct().count();
    }

    public static void main(String args[]) {
        String givenWord = "aba";
        boolean result = checkWordIsAnIsogram(givenWord);
        if(result == true) {
            System.out.println(givenWord + " is an Isogram");
        }
        else {
            System.out.println(givenWord + " NOT an Isogram");
        }
    }
}