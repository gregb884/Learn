package codewars;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static void main(String[] args)
    {

        duplicateCount("jaaddsaaaAe");



    }

    static final int NO_OF_CHARS = 256;

    public static int duplicateCount(String text)
    {
        int result = 0;
        int count[] = new int[NO_OF_CHARS];
        for(int i = 0; i < text.length(); ++i){
            count[Character.toLowerCase(text.charAt(i))]++;
        }
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if(count[i] > 1) {
                result++;
            }
        }

        System.out.println(result);
        return result;

    }
}