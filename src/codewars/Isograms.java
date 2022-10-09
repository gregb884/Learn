package codewars;

import java.util.Locale;

public class Isograms
{

    public static void main(String[] args)
    {

        isIsogram("ziomek");

    }


    public static boolean isIsogram(String word)
    {
        boolean result = word.length() == word.toLowerCase().chars().distinct().count();
        if(result == true) {
            System.out.println(word + " is an Isogram");
        }
        else {
            System.out.println(word + " NOT an Isogram");
        }

        return word.length() == word.toLowerCase().chars().distinct().count();
    }



}

